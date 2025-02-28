package TempConvert;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		//Starting Scanner
		Scanner console = new Scanner(System.in);
		
		//Greet user
		greeting();
		
		//Fahrenheit or Celsius
		System.out.println("Would you like to convert (F)ahrenheit to (C)elcius or (C)elsius to (F)ahrenheit?");
		System.out.println("(F) or (C)?");
		String tempSelector = console.nextLine();
		
		//Get the Temperature
		System.out.println("What is the temperature you'd like to convert?");
		int tempToConvert = console.nextInt();
		
		tempConverter(tempSelector, tempToConvert);
		
		System.out.println("Program by: EJ Baker");
		
	}
	
	public static void greeting() {
		System.out.println("Welcome, what temperature would you like to convert?");
		System.out.println("You can convert Fahnrenheit to Celsius\n");
	}
	
	public static void tempConverter(String tempSelector, int tempToConvert) {
		//Fahrenheit to Celsius
		if (tempSelector.equalsIgnoreCase("F")) {
			double tempConversion = (5.0/9)*(tempToConvert-32);
			System.out.println("The conversion in is Celsius: " + tempConversion);
		}
		//Celsius to Fahrenheit
		else if (tempSelector.equalsIgnoreCase("C")) {
			double tempConversion = (tempToConvert*1.8)+32;
			System.out.println("The conversion to Fahrenheit: " + tempConversion);
		}
		else {
			System.out.println("That was an invalid entry");
		}
	}

}
