package methodPractice;

public class methodPractice {

	public static void main(String[] args) {
		System.out.println("Hello Method");
		int x = 5;
		int y = 8;
		System.out.println(add(x,y));
		System.out.println(subtract(x,y));
		System.out.println(multiply(x,y));
		System.out.println(divide(x,y));

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

		//Method which java cannot work without. Methods are like functions def in python
	}	
	
	public static void topOfSign() {
		System.out.println("    ________");
		System.out.println("   /        \\");
		System.out.println("  /          \\");
	}
	
	public static void bottomOfSign() {
		System.out.println("  \\          /");
		System.out.println("   \\        /");
		System.out.println("    ________");
		
	}
	
	public static void stopSign() {
		System.out.println("  |   STOP   |");
	}
	
	public static void lineBreak() {
		System.out.println("+--------------+\n");
	}
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int subtract(int x, int y) {
		return x-y;
	}
	
	public static int multiply(int x, int y) {
		return x*y;
	}
	
	public static double divide(int x, int y) {
		return x/y;
	}
	
}
