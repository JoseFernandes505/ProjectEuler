import java.util.*;

public class LargestPalindromeProduct {
	
	public static void main(String[] args){
		
			List<Integer> palindromes = new ArrayList<Integer>();
			
			for(int i = 0; i < 1000; i++){
				for(int j = 0; j < 1000; j++){
				
					int resultInt = i * j;
					String resultStr = "" + resultInt;
				
					boolean palindrome = true;
					for(int k = 0; k < resultStr.length() / 2; k++){
						if ( resultStr.charAt(k) != resultStr.charAt(resultStr.length() - 1 - k ) ){
							palindrome = false;
							break;
						}
					}
					
					if(palindrome){
						palindromes.add(resultInt);
					}
					
				}				
			}
			
			Collections.sort(palindromes);
			
			System.out.println(palindromes.get( palindromes.size() - 1 ));
		
	}	
	
	
}