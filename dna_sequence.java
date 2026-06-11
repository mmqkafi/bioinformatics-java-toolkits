package bioinformatics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class dna_sequence {
	public static void main(String[] args) throws IOException{
						
		BufferedReader br = new BufferedReader( new FileReader( args[0]));
		GC_count gc_content = new GC_count();
		Reverse_complement rc = new Reverse_complement();
		Kmer k_mer = new Kmer();
		String lines ;
		
		
		while( (lines = br.readLine()) != null  ) {
			if ( lines.startsWith(">")) {
				continue;				
			}else {	
				// GC count in %				
				double count = gc_content.gc_count(lines);
				System.out.println("Per sequence GC % " + count );
				
				// Reverse complement 
				String reverse_complement = rc.reverse_c(lines);
				System.out.println(reverse_complement );
				
				// K-mer
			    //k_mer.kmer(lines);
			    System.out.println(k_mer.kmer(lines));
			}	
					
		}	br.close();

	}

}
