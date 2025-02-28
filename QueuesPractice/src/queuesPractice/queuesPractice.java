package queuesPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class queuesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setup a queue via a linkedList
		
		
		Queue<String> fortnitePlayers = new LinkedList<>();
		
		fortnitePlayers.add("Casey");
		fortnitePlayers.add("Anas");
		fortnitePlayers.add("AJ");
		fortnitePlayers.add("Marisa");
		fortnitePlayers.add("Angel");
		
		System.out.println("The players in the queue are as follows: " + fortnitePlayers);
		
		//Check the queue size
		System.out.println("The size of the queue is currently: " + fortnitePlayers.size());
		
		//Peeking at the front
		System.out.println("The person in front is: " + fortnitePlayers.peek());
		
		//Removing the first person in line
		System.out.println("Removed from queue: " + fortnitePlayers.remove());
		
		//Look for specific player
		System.out.println("Is the player 'Angel' in the queue?\n" + fortnitePlayers.contains("Angel"));
		
		//Array double-ended queue deque
		Queue<Integer> semesterGrades = new ArrayDeque<>();
		semesterGrades.add(80);
		semesterGrades.add(76);
		semesterGrades.add(43);
		semesterGrades.add(78);
		
		//In class exercise
		
		Scanner console = new Scanner(System.in);
		
		Queue<String> simpsonFamily = new LinkedList<>();
		
		System.out.println("What are the Simspons names?");
		while (true) {
			String name = console.nextLine();
			
			if (name.equalsIgnoreCase("done")) {
				break;
			}
			System.out.println("You entered: "+name);
			
			simpsonFamily.add(name);
		}
		
		console.close();
		System.out.println(simpsonFamily);
	}

}
