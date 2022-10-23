
public class Human1 {
	private String name;
	private int age;
	private Gender gender;
	
	private int locX;
	private int locY;
	
	public Human1(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		this.locX = 0;
		this.locY = 0;
	}
	
	public Human1() {
		this.locX = 0;
		this.locY = 0;
	}
	
	// getter/setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void walk(int distance, Direction direction) {
		if (direction == Direction.North) {
			this.locY+=distance;
		} else if (direction == Direction.South) {
			this.locY-=distance;
		} else if (direction == Direction.East) {
			this.locX+=distance;
		} else if (direction == Direction.West) {
			this.locX-=distance;
		}
		printCurrentLocation();
		
		
	}

	private void printCurrentLocation() {
		// TODO Auto-generated method stub
		System.out.println(name + " is now at ("+this.locX+","+this.locY+")" );
	}
	
	public void talk(String words) {
		System.out.println(name + " talked \"" + words + "\"");
	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return "name:"+this.name+";age:"+this.age+";gender:"+this.gender;
	}
	
	
}
