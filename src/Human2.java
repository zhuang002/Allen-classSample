
public class Human2 extends Mamal {
	private String name;
	
	public Human2(String name, int age, Gender gender) {
		super(age, gender, 0, 2);
		this.name = name;
		this.type = "Human";
	}
	
	public void talk(String words) {
		System.out.println(name + " talked \"" + words + "\"");
	}
	
	public void walk(int distance, Direction dir) {
		this.move(distance, dir);
	}
	
	public String getInfo() {
		// TODO Auto-generated method stub
		return "name:"+this.name+";age:"+this.age+";gender:"+this.gender;
	}
	
	@Override
	public void printCurrentLocation() {
		System.out.println(name + " is now at ("+this.locX+","+this.locY+")");
	}
	
	@Override 
	public String toString() {
		return getInfo();
	}
}
