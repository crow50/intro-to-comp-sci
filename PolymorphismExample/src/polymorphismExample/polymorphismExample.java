package polymorphismExample;

// Parent Class
class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
	String name;
	String animalColor;
	int yearOfBirth;
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Woof! Woof!");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Meow! Meow!");
	}
}

class Cow extends Animal{
	@Override
	void makeSound() {
		System.out.println("Moo! Moo!");
	}
}

public class polymorphismExample {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		Animal myCow = new Cow();
		
		myDog.makeSound();
		myCat.makeSound();
		myCow.makeSound();
		myDog.yearOfBirth(2000);
		System.out.println(myDog.yearOfBirth);
		
	}
}