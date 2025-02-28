package userInput;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		//System output initiation
		System.out.println("Welcome to the GPA calulator");
		
		//Initiate user input
		Scanner userInput = new Scanner(System.in);

		// User name input
		System.out.println("Please enter your name:");
		String userName = userInput.nextLine();
				
		// Test output
		System.out.println("Your name is: " + userName);
				
		System.out.println("Enter your GPA:");
		double myGPA = userInput.nextDouble();
		
		System.out.println("Your GPA is: " + myGPA);
		
		// Temperature task
		System.out.println("Please enter the current temperature in whole numbers, round up or down:");
		int f = userInput.nextInt();
		double c = (f-32)/1.8;
		System.out.println("The current temp in Fahrenheit is: " + f);
		System.out.println(c);
		System.out.println("The current temp in Celsius is: " + c);
		
		userInput.close();

		
	}

}
