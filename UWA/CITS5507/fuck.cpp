#include <stdio.h>
#include <omp.h>

int main(int argc, char *argv[])
{
  #pragma omp parallel
  {
    int NCPU,tid,NPR,NTHR;

    /* get the total number of CPUs/cores available for OpenMP */
    NCPU = omp_get_num_procs();

    /* get the current thread ID in the parallel region */
    tid = omp_get_thread_num();

    /* get the total number of threads available in this parallel region */
    NPR = omp_get_num_threads();

    /* get the total number of threads requested */
    NTHR = omp_get_max_threads();

    /* only execute this on the master thread! */
    if (tid == 0) {
        printf("%i : NCPUt= %i\n",tid,NCPU);
        printf("%i : NTHRt= %i\n",tid,NTHR);
        printf("%i : NPRt= %i\n",tid,NPR);
    }
//    printf("%i : hello user! I am thread %i out of %in",tid,tid,NPR);
  }
  return(0);
}
