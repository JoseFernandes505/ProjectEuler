public class EvenFib{
	
	public static void main(String[] args){
		
		int sum = 0, currFib = 1, prevFib = 1;
		
		do{
			
			int temp = currFib;
			currFib += prevFib;
			prevFib = temp;
			
			if(currFib % 2 == 0){
				sum += currFib;
			}
			
		}while(currFib < 4000000);
		
		System.out.println("The total sum of the Fibonacci sequence, up until 4 million, counting only the even integers, is: " + sum);
	}
	
	
}