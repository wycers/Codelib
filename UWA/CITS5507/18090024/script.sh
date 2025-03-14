#!/bin/bash
#SBATCH --partition=work
#SBATCH --account=courses0101
#SBATCH --mem=200G
#SBATCH --time=01:30:00
#SBATCH --cpus-per-task=128
#SBATCH --ntasks=1
#SBATCH --nodes=1

export OMP_NUM_THREADS=128

N_VALUES=(10000 20000 40000 60000 80000 100000)

# Loop through each N value
for N in "${N_VALUES[@]}"; do
    # Compile the program with the current value of N
    g++ -D N=$N -o n$N -std=c++17 -O3 -fopenmp ./main.cpp 

    # Run the compiled program using srun
    srun -c 128 ./n$N > n$N.out
done
