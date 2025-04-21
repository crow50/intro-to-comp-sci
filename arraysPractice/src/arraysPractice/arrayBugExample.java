package arraysPractice;

public class arrayBugExample {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int sum = 0;
		
		for (int i = 1;i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum: " + sum);
	}

}
