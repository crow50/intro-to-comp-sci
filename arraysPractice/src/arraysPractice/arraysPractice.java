package arraysPractice;

import java.util.Scanner;
import java.util.Arrays;

public class arraysPractice {
	public static void main(String[] args) {
		//Java Collection Framework
		//Arrays are a type of list, 
		Scanner studentInput = new Scanner(System.in);
		
		String [] students = new String [18];
		
		students[0] = "jOE";
		students[1] = "bob";
		students[2] = "billy";
		students[3] = "susie";
		students[4] = "steve";
		students[5] = "dan";
		students[6] = "jane";
		students[7] = "ruby";
		students[8] = "rufus";
		students[9] = "remy";
		students[10] = "lady love";
		students[11] = "fawn";
		students[12] = "ginger";
		students[13] = "stacys mom";
		students[14] = "doe";
		students[15] = "rita";
		students[16] = "bluey";
		
		int [] numberArray = {0, 1, 2, 3};
		
		int [] myGrades = new int[4];
		myGrades [0] = 64;
		
		System.out.println(myGrades[0]);
		
		System.out.println(Arrays.toString(students));
		
		//Concatenate arrays to form a string
		String studentName = studentInput.nextLine();
		students[17] = studentName;
		System.out.println(Arrays.toString(students));
		
		
		//In class assignment
		int [] numbersArray = {5, 10, 15, 20, 15};
		for (int i = 0; i < numbersArray.length; i++) {
			int summedNumber;
			summedNumber = numbersArray[i];
		}
		numbersArray[5] = numbersArray[1] + numbersArray[2];
		System.out.println(numbersArray);

		
	}
}
