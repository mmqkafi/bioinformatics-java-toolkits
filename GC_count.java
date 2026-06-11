package bioinformatics;

public class GC_count {

	public double gc_count(String lines) {
		
		double gc = 0;
		int c = 0;
		int g = 0;
		int t = 0;
		int a = 0;
		
		for ( int i = 0; i<=lines.length()-1;  i++ ) {			
			char ch = lines.charAt(i);
			
			if ( ch == 'G' ) { g++; }
			if ( ch == 'C' ) { c++; }
			if ( ch == 'A' ) { a++; }
			if ( ch == 'T' ) { t++; }
				
			
		}
		double c_g = c + g;
		double all = a + c + g + t;
		gc = c_g / all * 100;
		
		
		return gc;
	} 
	
}
