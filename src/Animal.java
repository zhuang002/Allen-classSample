
public class Animal {
	protected String type = "animal";
	protected int weight=0;

	protected int age;
	protected Gender gender;
	protected int locX=0;
	protected int locY = 0;
	
	public Animal(int age, Gender gender, int weight) {
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	

	
	public void move(int distance, Direction direction) {
		if (direction == Direction.North) {
			this.locY+=distance;
		} else if (direction == Direction.South) {
			this.locY-=distance;
		} else if (direction == Direction.East) {
			this.locX+=distance;
		} else if (direction == Direction.West) {
			this.locX-=distance;
		}
	}
	
	public void printCurrentLocation() {
		// TODO Auto-generated method stub
		System.out.println("The " + this.type +" is now at ("+this.locX+","+this.locY+")" );
	}

}
