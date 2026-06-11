package bioinformatics;

/*
public  class Kmer {
	
	public String  kmer(String lines) {
		
		String result = "";
		int k = 3;		
		for ( int i = 0; i<= lines.length() - k ; i++ ) {
			 result += lines.substring(i, k+i) + "-" ;
								}			
		return result;
			} 	
}*/
public  class Kmer {
	
	public void  kmer(String lines) {
		
		String result = "";
		int k = 3;		
		for ( int i = 0; i<= lines.length() - k ; i++ ) {
			 result += lines.substring(i, k+i) + "-" ;
								}			
	  System.out.println("Kmer: " +result);
			} 	
}