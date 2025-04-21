package csGradeCalculator;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class CSGradeCalculator {
	
	public static int sum(Queue<Integer> grades) {
		int sumOfGrades = 0;
		for (int grade : grades) {
			sumOfGrades += grade;
		}
		return sumOfGrades;
	}
	
	public static void main(String[] args) {
		//Prompt for input
		System.out.println("Welcome,\nHow many grades would you like to caculate?");
		
		Scanner console = new Scanner(System.in);
		
		int numOfGrades = console.nextInt();
		
		System.out.println("Alright, " + numOfGrades + "\nNow go ahead and enter each grade:");
		
		Queue<Integer> userGrades = new LinkedList<>();
		
		while (numOfGrades != userGrades.size()) {
			//Store input in array
			int grade = console.nextInt();
			userGrades.add(grade);
		}
			
		//Get sum of grades
		int sumOfGrades = sum(userGrades);
		
		//Calculate avg
		double average = (double) sumOfGrades / userGrades.size();
		
		System.out.println("Your grade point total is: " + sumOfGrades);
		System.out.println("Your grade point average is: " + average);
		
		System.out.println("_________\r\n"
				+ "\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "Go Hatters!!\r\n"
				+ "\r\n"
				+ "Program by: EJ Baker\r\n"
				+ "\r\n"
				+ "_________");
		}
		

	}

