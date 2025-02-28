package linkedListPractice;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPractice {
	
	public static void main(String[] args) {
		/*
		LinkedList<String> stetsonStudents = new LinkedList<>();

		//Add students to linked list
		stetsonStudents.add("Bob");
		stetsonStudents.add("Tim");
		stetsonStudents.add("EJ");
		stetsonStudents.add("Steve");
		
		
		System.out.println(stetsonStudents);
		
		//Remove students
		stetsonStudents.remove();
		
		System.out.println(stetsonStudents.peek());
		
		System.out.println(stetsonStudents);
		
		
		stetsonStudents.sort(null);
		System.out.println(stetsonStudents);
		
		*/
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter a number and press enter");
		
		LinkedList<Integer> intList = new LinkedList<>();
		
		do {
			int userIntList = console.nextInt();
			intList.add(userIntList);
		} while (intList.size() < 5);
		console.close();
		System.out.println(intList);
		int sum = 0;
		for (int i = 0; i < intList.size(); i++) {
			sum += intList.get(i);
			System.out.println(sum);
		}
		
		/*
		System.out.println("Please enter a \"String\" and press enter");
		
		LinkedList<String> stringList = new LinkedList<>();
		
		while (true) {
			String userString = console.nextLine();
			if (userString.equalsIgnoreCase("break")) {
				console.close();
				System.out.println("Your list contains: ")
				break;
			}
			stringList.add(userString);

		}
		*/
		

	}

}
