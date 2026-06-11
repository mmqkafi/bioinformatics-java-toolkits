# Bioinformatics Java Toolkit/ .jar

## Features
GC content calculation(%)
Reverse complement 
k-mer generation ( k = 3)

## Project Strcture
dna_sequence.java > Main program, read input files and run analysis
GC_count.java > Calculate GC in %
Reverse_complement.java > It creates reverse complement of DNA sequence
Kmer.java > This creates k-mers (3) from sequence

## Input 
This program accpts FASTA format file

...
>sequence1  
ACTGATGC  
...


## How to run
compile: javac bioinformatics/*.java

java dna_sequence file.fasta

## Output
It generates: GC percentage, Reverse complement and k-mers

## Project structure

```text
Bioinformatics tools using java/
├── dna_sequence.java
├── GC_content.java 
├── Kmer.java 
└── README.md            # Documentation
```


