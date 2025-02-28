package inClassQuiz;

import java.util.Scanner;

public class inClassQuiz {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		//Problem 1:
		System.out.println("Please enter your age:");
		int userAge = userInput.nextInt();
		
		if (userAge >= 18)
			System.out.println("You are eligible to vote!");
		else
			System.out.println("You are not eligible to vote yet.");
		
		//Problem 2:
		System.out.println("Please enter your quiz score:");
		int userScore = userInput.nextInt();
		
		//Assumes incomplete by default
		String letterGrade = "IP";
		
		//Calculates letter grade based on numerical input
		if (userScore >= 90)
			letterGrade = "A";
		else if (userScore >= 80)
			letterGrade = "B";
		else if (userScore >= 70)
			letterGrade = "C";
		else if (userScore >=60)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		System.out.println("You received an " + letterGrade + " on the quiz.");
		
		//Problem 3
		System.out.println("Please enter numero uno:");
		double userNum1 = userInput.nextDouble();
		System.out.println("Please enter numero dos:");
		double userNum2 = userInput.nextDouble();
		
		//Performs addition method
		System.out.println("Addition: "+ (userNum1+userNum2));
		
		//EC
		
	}
	
	public static void quizGrade(int userScore) {
		
	}
	

}
