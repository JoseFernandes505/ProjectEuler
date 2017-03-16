
public class PrimeFactors{
	
	public static void main(String[] args){
		long test = 600851475143L;
	
	long i = 2L;
		while( i < test ){
			
			if( test % i == 0 ){
				
				System.out.println( i + " ");
				test /= i;
				i = 2;
			} else {
				i++;
				if( i == test ){
					System.out.println( i + " ");
				}
			}
		}
	}
	
}
