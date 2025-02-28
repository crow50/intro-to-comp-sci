package NumberGuess;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

	public static void main(String[] args) {
		//Initialize console and rand
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Wann45"
				+ "a play some Gambit?");
		
		//Sets the random computer number
		int number = rand.nextInt(100);
		System.out.println(number);

		//Gets the users guess
		System.out.println("Enter a two digit number to begin the guessing:");
		int guess  = console.nextInt();
		
		//Tracks the number of guesses
		int numOfGuesses = 1;
		
		//The GAME
		while (guess != number) {
			numOfGuesses++;
			System.out.println("Ooh, nice try though. Matches: " + matches(number, guess));
			System.out.println(diffMess(number, guess));
			System.out.println("What is your guess?");
			guess  = console.nextInt();
		}
		
		//Congratulations!!!
		System.out.println("Haven't seen that one in awhile. Tries: " + numOfGuesses);
		System.out.println("Go Hatters!!");
		System.out.println("Program by: EJ Baker");
	}
	
	public static String diffMess(int number, int guess) {
		//Indicates to the user if they are too high or too low
		if ((number - guess) < 0) {
			return "Shooting for the moon there junior";
		}
		else if ((number - guess) > 0) {
			return "So close, but yet so far";
		}
		else {
			return "Spot on";
		}
	}
	
	
	public static int matches(int number, int guess) {
		//Show the user the number of digits that match the number
		int matches = 0;
		if (guess / 10 == number /10 || guess / 10 == number % 10) {
			matches++;
		}
		if ( guess / 10 != guess % 10 && guess % 10 == number / 10 || guess % 10 == number % 10 ) {
			matches++;
		}
		
		return matches;
		
	}

}
