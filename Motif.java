package bioinformatics;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;*/

public class Motif { /*
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader( new FileReader( args[0]));
		Motif motif_dna = new Motif();
		
		String lines ;				
		while( (lines = br.readLine()) != null ) {
			if ( lines.startsWith(">")) {
				continue ;	
			}
			else {	
				// I will call Motif method here 
					motif_dna.motif(lines);	
					}				
		}br.close();
	}*/
	public  void motif(String lines ) {	
		
		
		System.out.println("Motif: " + lines.contains("AAA"));
		System.out.println("Motif position "  + lines.indexOf("AAA"));		
		
	}


}		


