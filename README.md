# Bioinformatics Java Toolkit/ .jar

## Features
GC content calculation(%)
Reverse complement 
k-mer generation ( k = 3)
Mofit
ORF Open Reading Frame

## Project Strcture
dna_sequence.java is the  Main program, read input files and run analysis
GC_count.java  Calculate GC in %
Reverse_complement.java  It creates reverse complement of DNA sequence
Kmer.java  This creates k-mers (3) from sequence
ORF it counts open reading frame 


## Input 
This program accpts FASTA format file

...
>sequence1 
ACTGATGC 
...


## How to run
Compile: javac bioinformatics/*.java

Run: java dna_sequence file.fasta

## Output
It generates: GC percentage, Reverse complement,  k-mers(3), ORF, Motif

## Project structure

```text
Bioinformatics tools using java/
├── dna_sequence.java
├── GC_content.java 
├── Kmer.java 
└── README.md            # Documentation
```


