
public class Dog extends Mamal {
	public Dog() {
		super(0, Gender.Male, 10, 4);
		this.type = "Dog";
	}
	
	public void bark() {
		this.makeSound();
	}
	
	@Override
	public void makeSound() {
		System.out.println("Wang wang wang.");
	}
}
