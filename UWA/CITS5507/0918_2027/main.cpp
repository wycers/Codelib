/**
 * Under the test env, use compile arguments to control the size.
 * Under the development env, no need to change anything.
 */
#ifndef N
#define N 5000
#endif

#include <chrono>
#include <cstring>
#include <fstream>
#include <iostream>
#include <memory>
#include <random>
#include <omp.h>

using namespace std;

// random_device rd;
// mt19937 generator(rd());
// uniform_int_distribution<int> valueDist(1, 100);
// sorry but plain generator is ~2x faster than uniform_int_distribution<int>
// inline int roll() { return static_cast<int>(generator() % 100 + 1); }

struct SparseMatrix {
    vector<vector<pair<int, int> > > data;

    explicit SparseMatrix(const int p) {
        data = vector<vector<pair<int, int> > >(N);
#pragma omp parallel for schedule(dynamic)
        for (int i = 0; i < N; ++i) {
            // cout << "Thread " << omp_get_thread_num() << " " << i << endl;
            // Set up a random number generator
            std::mt19937 rng(std::chrono::steady_clock::now().time_since_epoch().count());
            std::uniform_int_distribution<int> value_dist(1, 100); // Value range
            std::uniform_int_distribution<int> prob_dist(1, 100); // Prob
            for (int j = 0; j < N; ++j) {
                if (prob_dist(rng) <= p) {
                    // p% chance of a non-zero element
                    int value = value_dist(rng);
                    data[i].emplace_back(value, j); // Store the value and column index
                }
            }
        }
    }

    void dump(const string &prefix) {
        ofstream fileB(prefix + "_B");
        ofstream fileC(prefix + "_C");
        if (!fileB || !fileC) {
            cerr << "Unable to open file for writing\n";
            return;
        }
        cout << "Dumping matrix with prefix: " << prefix << endl;
        for (int i = 0; i < N; ++i) {
            if (data[i].empty()) {
                fileB << "0 0" << endl;
                fileC << "0 0" << endl;
                continue;
            }
            for (const auto [b, c]: data[i]) {
                fileB << b << " ";
                fileC << c << " ";
            }
            fileB << endl;
            fileC << endl;
        }
        fileB.close();
        fileC.close();
    }
};

struct Matrix {
    unique_ptr<unique_ptr<int[]>[]> data;

    Matrix(): data(new std::unique_ptr<int[]>[N]) {
#pragma omp parallel for schedule(dynamic)
        for (int i = 0; i < N; ++i) {
            data[i] = unique_ptr<int[]>(new int[N]()); // Zero-initialized
        }
    }

    int &at(const int r, const int c) const {
        return data[r][c];
    }
};

// task 1: original multiply two matrices
void sequential_multiply(const SparseMatrix &x, const SparseMatrix &y, const Matrix *res) {
#pragma omp parallel for schedule(dynamic)
    for (int i = 0; i < N; ++i) {
        // cout << "Thread " << omp_get_thread_num() << " " << i << endl;
        for (const auto [v1, k]: x.data[i]) {
            for (const auto [v2, j]: y.data[k]) {
                res->at(i, j) += v1 * v2;
            }
        }
    }
}


void work(const double probability) {
    const int p = static_cast<int>(probability * 100);
    double t = omp_get_wtime();
    cout << "Probability: " << probability << " (" << p << "/100)" << endl;
    t = omp_get_wtime();
    cout << "Preparation started at " << t << endl;
    double t0 = omp_get_wtime();
    auto X = SparseMatrix(p);
    cout << "Preparation X cost " << omp_get_wtime() - t0 << endl;
    t0 = omp_get_wtime();
    auto Y = SparseMatrix(p);
    cout << "Preparation Y cost " << omp_get_wtime() - t0 << endl;
    t0 = omp_get_wtime();
    const Matrix res;
    cout << "Preparation res cost " << omp_get_wtime() - t0 << endl;
    cout << "Preparation cost " << omp_get_wtime() - t << endl;
    t = omp_get_wtime();
    cout << "Preparation ended at " << t << endl;
#ifdef DUMP
    // task 2: dump b and c.
    X.dump(to_string(N) +"_" + to_string(p) + "_100" + "_X");
    Y.dump(to_string(N) +"_" + to_string(p) + "_100" + "_Y");
#endif

    t = omp_get_wtime();
    cout << "Sequential multiply started at " << t << endl;
    sequential_multiply(X, Y, &res);
    cout << "Sequential multiply cost " << omp_get_wtime() - t << endl;
    t = omp_get_wtime();
    cout << "Sequential multiply ended at " << t << endl;
}


int main() {
    cout << "Matrix Size: " << N << std::endl;
    cout << "Total number of threads: " << omp_get_num_threads() << std::endl;
    cout << "Max number of threads: " << omp_get_max_threads() << std::endl;
    for (const double probability: {0.01, 0.02, 0.05}) {
        cout << "=========================================" << endl;
        work(probability);
    }
    return 0;
}

