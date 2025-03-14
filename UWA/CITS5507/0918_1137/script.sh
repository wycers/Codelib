#!/bin/bash
#SBATCH --partition=work
#SBATCH --account=courses0101
#SBATCH --mem=200G
#SBATCH --cpus-per-task=128
#SBATCH --nodes=1
#SBATCH --ntasks=1
#SBATCH --time=02:00:00

# Define the core/thread configurations and N values
CORES=(28 56 64 84 128)
THREADS=(28 56 64 84 128)
N_VALUES=(80000 100000)

# Loop through each N value
for N in "${N_VALUES[@]}"; do
    # Compile the program with the current value of N
    g++ -D N=$N -o n$N -std=c++17 -O3 -fopenmp ./main.cpp

    for core in "${CORES[@]}"; do
        for thread in "${THREADS[@]}"; do
            # Set the number of threads in OpenMP
            export OMP_NUM_THREADS=$thread

            # Run the compiled program using srun
            srun -c $core ./n$N > n${N}_${core}c${thread}t.out
        done
    done
done
