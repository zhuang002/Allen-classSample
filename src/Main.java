import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human2 peter = new Human2("Peter", 10, Gender.Male);
		Human2 helen = new Human2("Helen", 12, Gender.Female);
		
		peter.walk(10, Direction.East);
		peter.printCurrentLocation();
		helen.walk(20, Direction.West);
		helen.printCurrentLocation();
		
		peter.talk("He he he");
		
		String info = peter.getInfo();
		System.out.println(info);

		System.out.println(helen.getInfo());
		
		Animal animal1 = new Animal(0, Gender.Male, 20);
		animal1.move(10, Direction.East);
		animal1.printCurrentLocation();
		
		
		Mamal mamal1 = new Mamal(0, Gender.Female, 20, 4);
		mamal1.move(20, Direction.South);
		mamal1.printCurrentLocation();
		
		mamal1.makeSound();
		
		Dog dog = new Dog();
		dog.move(10, Direction.West);
		dog.printCurrentLocation();
		dog.bark();
		
		System.out.println("Mamal information: "+mamal1);
		System.out.println("Human information: " + peter);
		System.out.println("Human information: " + helen);
		Integer anInt = 123;
		System.out.println("The integer is: "+anInt.toString());
		
		Human2 peter2 = new Human2("Peter", 10, Gender.Male);
		
		System.out.println(peter == peter2);
		System.out.println(peter.equals(peter2));
		
		ArrayList<Human2> peoples = new ArrayList<>();
		peoples.add(peter);
		peoples.add(helen);
		peoples.add(new Human2("David",15, Gender.Male));
		peoples.add(new Human2("Alice", 8, Gender.Female));
		peoples.add(new Human2("Derek", 20, Gender.Male));
		
		Collections.sort(peoples);
		
		for (Human2 people:peoples) {
			System.out.println(people);
		}
		
		System.out.println("=====");
		
		//lambda expression
		Collections.sort(peoples, (x, y) -> x.age - y.age);
		for (Human2 people:peoples) {
			System.out.println(people);
		}
		System.out.println("=====");
		
		peoples.add(new Human2("Peter", 2, Gender.Male));
		Collections.sort(peoples, (x, y) -> {
			int comp = x.name.compareTo(y.name);
			if (comp!=0) return comp;
			return x.age - y.age;
			
		});
		for (Human2 people:peoples) {
			System.out.println(people);
		}
		
	}

}


