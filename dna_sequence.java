package bioinformatics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;


public class dna_sequence {
	public static void main(String[] args) throws IOException{
		
		System.out.println("");
		System.out.println("=============== DNA Sequence Analysis ===============");
						
		BufferedReader br = new BufferedReader( new FileReader( args[0]));
		LocalDate date = LocalDate.now();
		GC_count gc_content = new GC_count();
		Reverse_complement rc = new Reverse_complement();
		Kmer k_mer = new Kmer();
		Motif motif_content = new Motif();
		//ORF orf_content = new ORF();
		ORF_Testing  orf_content = new ORF_Testing();
		String lines ;
		
		
		while( (lines = br.readLine()) != null  ) {
			if ( lines.startsWith(">")) {
			continue;	
				
				
			}
			
			
			else {	
				System.out.println("");
				// GC count in %				
				gc_content.gc_count(lines);
				
				// Reverse complement 
				rc.reverse_c(lines);
				
				// K-mer			    
			    k_mer.kmer(lines);
			    
			    // Motif
			    motif_content.motif(lines);
			    
			    // ORF
			    orf_content.ORF(lines);			    
			 System.out.println("");    
			}	
					
		}	br.close();

		System.out.println(" Date: " + date);
		System.out.println("");
		System.out.println(" ================== SUCCESSFULLY DONE ==================");
		System.out.println("");
		
	}

}
