package bioinformatics;

public class Reverse_complement {
	
	public String reverse_c(String lines) {
		StringBuilder s = new StringBuilder();
		
		
		for ( int i = 0;  i <= lines.length() - 1  ; i++ ) {
			
			char ch = lines.charAt(i);
			if ( ch == 'A')  s.append('T');
			else if (ch == 'G') s.append('C');
			else if ( ch == 'T') s.append('A');
			else if ( ch == 'C') s.append('G');	
								
			
			
			
		} return s.reverse().toString();

		
	}
	
}
