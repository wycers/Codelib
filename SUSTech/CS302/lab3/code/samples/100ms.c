#include <stdio.h>
#include <time.h>

int main()
{
    int t = 0;
    clock_t startTime = clock();
    while (clock() - startTime < 114514)
        ;
    printf("%lfs\n", (double)(clock() - startTime) / CLOCKS_PER_SEC);
    return 0;
}
