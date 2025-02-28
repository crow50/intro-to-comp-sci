package stringPractice;

public class CompSci27JAN2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Practice");
		
		String firstName = "Ernest";
		String lastName = "Baker";
		
		int myAge = 32;
		
		System.out.println("My first name is: " + firstName + "\nMy last name is: " + lastName + "\nI am: " + myAge);

		String myName = firstName + " " + lastName;
		int myNameLength = myName.length();
		
		System.out.println(myNameLength);
		
		System.out.println(myName.toUpperCase());
		System.out.println(myName.toLowerCase());
		
		String pokeFirstName = "Ash";
		String pokeLastName = "Ketchum";
		int pokeAge = 10;
		String pokeTown = "Pallet Town";
		String pokeInterest = "Catching Pokemon!!!";
		
		System.out.println(pokeFirstName + " " + pokeLastName + " " + pokeAge + " " + pokeTown + " " + pokeInterest);
	}

}
