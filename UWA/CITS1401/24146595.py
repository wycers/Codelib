"""
Author: Yechang Wu (24146595)
"""


class Organization:
    def __init__(self, obj):
        self.id = obj['organisation id'].lower()
        if len(self.id) == 0:
            raise KeyError
        self.country = obj['country'].lower()
        if len(self.country) == 0:
            raise KeyError
        self.category = obj['category'].lower()
        if len(self.category) == 0:
            raise KeyError

        self.number_of_employees = int(obj['number of employees'])
        if self.number_of_employees <= 0:
            raise ValueError
        self.median_salary = float(obj['median salary'])
        if self.median_salary <= 0:
            raise ValueError

        self.profit2020 = float(obj['profits in 2020(million)'])
        self.profit2021 = float(obj['profits in 2021(million)'])
        self.profit_delta = abs(
            self.profit2021 - self.profit2020) / self.profit2020 * 100


def csvread(filename):
    """Read csv from the given filename, convert the csv file's content to
    a list of organization objects.

    Args:
    filename: a string representing the filename of the corresponding csv file.

    Returns:
    A list of organization objects.

    """

    # read the file to get original lines
    lines = None
    try:
        f = open(filename)
        lines = f.read().splitlines()
        f.close()
    except FileNotFoundError:
        print(f"{filename} is not found")
        return []
    except Exception as err:
        print(f"{err}")
        return []

    # convert the lines into org objects
    # get the column names
    headings, *rows = lines
    colnames = [x.strip().lower() for x in headings.split(',')]
    # deal with the data
    data = []
    org_ids = {}  # to remove data with identical org id
    for row in rows:
        row_data = [x.strip() for x in row.split(',')]
        if len(colnames) != len(row_data):
            # this row can not be aligned with the headers, discard it
            continue

        obj = dict(zip(colnames, row_data))
        try:
            org = Organization(obj)
            if org.id in org_ids:
                # identical org id, discard the later one
                continue
            data.append(org)
            org_ids[org.id] = 1
        except KeyError as e:
            print(f"required field is missing: {e}")
        except ValueError as e:
            print(f"invalid number value: {e}")
        except Exception as e:
            print(f"{e}")

    return data


def cal_mean_s2(data):
    """calculate the mean value and the variance of the given data
    Args:
    data: a list of numbers

    Returns: a tuple consisting of mean value and the variance of the given data
    """
    if len(data) <= 0:
        return None, None
    if len(data) == 1:
        return data[0], 0
    mean = sum(data) / len(data)
    s2 = sum([(x - mean) ** 2 for x in data]) / (len(data) - 1)
    return mean, s2


def cal_t_test_score(x, y):
    """calculate the t test value of the two given list of numbers
    Args:
    x, y: two list of numbers

    Returns: the t test value of the two dataframes
    """
    m1, s21 = cal_mean_s2(x)
    m2, s22 = cal_mean_s2(y)

    return (m1 - m2) / ((s21 / len(x) + s22 / len(y)) ** 0.5)


def cal_minkowski_distance(x, y, p=3):
    """calculate the minkowski distance of the two given list of numbers
    Args:
    x, y: two list of numbers
    p: the dimension, default: 3

    Returns: the minkowski distance of the two dataframes
    """
    return sum([abs(i - j) ** p for i, j in zip(x, y)]) ** (1 / p)


def out1(data):
    countries = list(set([x.country for x in data]))
    res = {}
    for country in countries:
        # 0. filter the data from current country
        orgs = [x for x in data if x.country == country]

        # 1. map the data to their profits in 2020 and 2021
        profit2020 = [x.profit2020 for x in orgs]
        profit2021 = [x.profit2021 for x in orgs]

        # 2. map the data to their number of employees and median salary
        number_of_employees = [x.number_of_employees for x in orgs]
        median_salary = [x.median_salary for x in orgs]

        res[country] = [
            # t-test score of profits in 2020 and 2021 for each country
            round(cal_t_test_score(profit2020, profit2021), 4),

            # Minkowski distance between the number of employees and
            # the median salary for each country
            round(cal_minkowski_distance(number_of_employees, median_salary), 4)
        ]
    return res


def out2(data):
    categories = list(set([x.category for x in data]))
    res = {}
    for category in categories:
        # filter the data from current country
        orgs = [x for x in data if x.category == category]

        orgs.sort(key=lambda x: (-x.number_of_employees, -x.profit_delta))

        obj = {}
        for i, org in enumerate(orgs):
            obj[org.id] = [
                # number of employees
                org.number_of_employees,

                # abs percentage change in profit
                round(org.profit_delta, 4),

                # rank
                i + 1
            ]
        res[category] = obj

    return res


def main(csvfile):
    data = csvread(csvfile)
    return out1(data), out2(data)
