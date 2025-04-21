package quizPractice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QuizPractice {
	//User input
	//Loops through an array of numbers
	//Prints each number out
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		

		
		int numbers [] = {5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i != numbers.length; i++) {
			System.out.println(numbers[i]);			
		}
		
		
		
		Queue<Integer> groceryLine = new LinkedList<>();
		System.out.println("Please enter your Grocery Line:");
		
		do {
			int userInput = console.nextInt();
			groceryLine.add(userInput);
		} while (groceryLine.size() != 5);
		System.out.println("Your grocery numbers are: " + groceryLine);
				

	}

}

class Character {
	void identity() {
		System.out.println("I am the Character parent class.");
	}
}
