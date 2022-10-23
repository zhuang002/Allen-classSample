
public class Mamal extends Animal {
	private int numOfLegs;
	
	public Mamal(int age, Gender gender, int weight, int numlegs) {
		super(age, gender,weight);
		this.numOfLegs = numlegs;
		this.type = "Mamal";
	}
	
	public void makeSound() {
		System.out.println("Wu Wu Wu.");
	}
	
}
