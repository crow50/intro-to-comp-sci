package factorialRecursion;

public class FactorialRecusion {

	public static long factorial(int n) {
		//Base Case
		if (n==0||n==1) {
			return 1;
		}
		
		//Recursive Case
		return n * factorial(n-1);
	}
	
	public static int facReturn(int number) {
		if (number==0||number==1) {
			return 1;
		}
		
		return facReturn(number);
	}
	
	public static void main(String[] args) {
		int number = 5;
		long result = factorial(number);
		int facNum = facReturn(number);
			
		System.out.println("Factorial of " + number + " is: " + result);
		
		int loop = 1;
		while (number != loop-1) {
			System.out.println(loop);
			loop++;
		}
		
		System.out.println(facNum);
				
	}
	
	
}
