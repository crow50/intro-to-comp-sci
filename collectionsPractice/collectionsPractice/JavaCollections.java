package collectionsPractice;

import java.util.*;

public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 */
		
		HashMap<Integer, String> pokedex = new HashMap<>();
		
		pokedex.put(001, "Pikachu");
		pokedex.put(002, "Pikachu");
		pokedex.put(003, "Pikachu");
		pokedex.put(004, "Pikachu");
		pokedex.put(005, "Pikachu");
		pokedex.put(006, "Pikachu");
		pokedex.put(007, "Pikachu");
		pokedex.put(000, "Smith");

		
		System.out.println(pokedex);
		
		pokedex.remove(001);
		
		System.out.println(pokedex);
		
		ArrayList<String> lastNames = new ArrayList<>();
		
		lastNames.add("Smith");
		lastNames.add("Jones");
		lastNames.add("Manning");
		lastNames.add("Montana");
		
		System.out.println(lastNames);
		
		lastNames.remove(1);
		
		System.out.println(lastNames);
		
		
		
		HashSet<String> stetsonStudent = new HashSet<>();
		
		stetsonStudent.addAll(lastNames);
		
		//System.out.println(stetsonStudent + pokedex.containsValue(lastNames));
		
		Queue<String> printQueue = new LinkedList<>();
		
		printQueue.add("report.docx");
		printQueue.add("inventory.xls");
		printQueue.add("bankStatement.pdf");
		
		if (printQueue.peek().matches(".docx")) {
			String filetype = "Document";
			System.out.println(printQueue.peek() + filetype );
		}
		
		else {
			String filetype = "Unknown";
		}
		
		
		
		//HashMap<String, Integer, String> stetsonStudents = new HashMap<>();
		
		//TreeMap<String, Integer, String> lastNamesTree = new TreeMap<>();

		
		

	
	}

}
