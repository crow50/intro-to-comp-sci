package hashmapPractice;

import java.util.*;
import java.util.LinkedList;

public class HashmapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stetson Students hashmap
		//Putting the key as int and value as string
		HashMap<Integer, String> stetsonStudents = new HashMap();
		
		stetsonStudents.put(3976, "EJ");
		stetsonStudents.put(4578, "Nathan");
		stetsonStudents.put(8754, "Will");
		stetsonStudents.put(6793, "Jacob");
		
		System.out.println(stetsonStudents);
		
		
		//"Game" logic
		HashMap<String, Integer> bagOfHolding = new HashMap<>();
		
		bagOfHolding.put("Dragon Skin", 1);
		bagOfHolding.put("Rope", 50);
		bagOfHolding.put("Healing Potion", 10);
		bagOfHolding.put("Lockpick Tools", 5);
		bagOfHolding.put("Diamond", 1);

		System.out.println(bagOfHolding);
		
		bagOfHolding.remove("Rope");
		System.out.println(bagOfHolding);
		
		
		//How to add using a loop
		HashMap<Integer, String> autoAdd = new HashMap<>();
		
		int key = 1;
		String name = "Student Name";
		while (autoAdd.size() != 25) {
			autoAdd.put(key, name);
			key++;
		}
		
		System.out.println(autoAdd);

	}

}
