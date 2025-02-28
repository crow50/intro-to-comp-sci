package conditionalExecution;

import java.util.Scanner;

public class conditionalExecution {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double gpa = 1.9;
		if (gpa >= 2.0) {
			System.out.println("Good job!");
		}
		else {
			System.out.println("REJECTED!!!");
		}
		
		double percent = 82;
		
		if (percent >= 90) {
			System.out.println("A, you passed!");
		}
		else if (percent >= 80) {
			System.out.println("B");
		}
		else if (percent >= 70) {
			System.out.println("C");
		}
		else if (percent >= 60) {
			System.out.println("D");
		}
		else if (percent < 60) {
			System.out.println("F");
		}
		else {
			System.out.println("You messed up");
		}
		
		/*
		 * Three test
		 *int x = 1
		 *if (x > 0) {
		 *	System.out.println("x is something");
		 *}
		 *else if (x < 0) {
		 *	System.out.println("It's another thing");
		 *}
		 *else {
		 *	System.out.println("X is another thing entirely");
		 *}
		 *
		 */
		
		int dbaGrade = 95;
		
		if (dbaGrade >= 90) {
			System.out.println("Congrats, you passed the D.B.A Course!!!");
		}
		else {
			System.out.println("Ouch, you mised it by " + (90 - dbaGrade) + " points.");
		}
		
		
		System.out.println("Please enter your standing:");
		int place  = userInput.nextInt();

		if (place == 1) {
			System.out.println("First");
		}
		else if (place == 2) {
			System.out.println("Second");
		}
		else if (place == 3) {
			System.out.println("Third");
		}
		else if (place == 0) {
			System.out.println("Nice try...");
		}
		else {
			System.out.println("You tried, good job champ!");
		}
	}

}
