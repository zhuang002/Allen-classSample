
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human2 other = (Human2) obj;
		
		return this.name.equals(other.name) && this.age == other.age && this.gender == other.gender;
	}
	
	
}
