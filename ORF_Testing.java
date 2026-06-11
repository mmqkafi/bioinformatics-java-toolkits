package bioinformatics;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
*/
public class ORF_Testing {/* 
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader( new FileReader( args[0]));
		ORF_Testing orf_testing = new ORF_Testing();
				
		String lines ;				
		while( (lines = br.readLine()) != null ) {
			if ( lines.startsWith(">")) {
				continue ;	
			}
			else {	
				orf_testing.ORF(lines);
			}
	}br.close();
}	*/
public String ORF(String lines) {
		
	 String seq = lines;
	 
    
         /*
     if ( seq.indexOf("ATG") != -1  )
     { 
    	 System.out.println(seq.indexOf("ATG"));   	 
    	 System.out.println("Start codon found");
    	 
     }
     if ( seq.indexOf("TAA") != -1  )
     { 
    	 System.out.println(seq.indexOf("TAA"));   	 
    	 System.out.println("Stop codon found");
    	 
     }
     */
     if ( seq.indexOf("ATG") != -1  && seq.indexOf("TAA") != -1 ) {
     int start = seq.indexOf("ATG");
     int stop = seq.indexOf("TAA");
     
     System.out.println(seq.indexOf("ATG"));   	 
	 System.out.println("Start codon found");
	 System.out.println(seq.indexOf("TAA"));   	 
	 System.out.println("Stop codon found");
	 
	
     
     if ( stop > start ) {
     
     String orf_sequence = seq.substring(start + 3, stop);
     System.out.println("ORF Seq: " + orf_sequence); 
     System.out.println("");
     }
     
     
     }
		
		return  "";		
	}	
	
	
	
}	


	


