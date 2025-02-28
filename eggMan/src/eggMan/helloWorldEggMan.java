package eggMan;

public class helloWorldEggMan {

	public static void main(String[] args) {
	welcome();
	topOfSign();
	bottomOfSign();
	System.out.println();
	bottomOfSign();
	lineBreak();
	System.out.println();
	topOfSign();
	stopSign();
	bottomOfSign();
	System.out.println();
	topOfSign();
	lineBreak();
	goodbye();
	}	
	
	public static void topOfSign() {
		//Generates the top of any given round or octagonal sign
		System.out.println("    ________");
		System.out.println("   /        \\");
		System.out.println("  /          \\");
	}
	
	public static void bottomOfSign() {
		//Generates the bottom of any give round or octagonal sign
		System.out.println("  \\          /");
		System.out.println("   \\        /");
		System.out.println("    ________");
		
	}
	
	public static void stopSign() {
		//Provides content for sign, in this case STOP
		System.out.println("  |   STOP   |");
	}
	
	public static void welcome() {
		//Program introduction
		System.out.println("Hello World!");
		System.out.println("This is my first Java program!!");
	}
	
	public static void goodbye() {
		//Program outro and signature
		System.out.println("Go Hatters!!");
		System.out.println("Program by: EJ Baker");
	}
	
	public static void lineBreak() {
		//Creates line break when called
		System.out.println("+--------------+\n");
	}

}
