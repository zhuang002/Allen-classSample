
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human1 peter = new Human1("Peter", 10, Gender.Male);
		Human1 helen = new Human1("Helen", 12, Gender.Female);
		
		peter.walk(10, Direction.East);
		helen.walk(20, Direction.West);
		
		peter.talk("He he he");
	}

}


