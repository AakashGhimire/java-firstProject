package abstraction;

//purpose - reusability of code
public abstract class Animal {
	
	public void run() {
		System.out.println("animals cannot run");
	}

	public void walk(){
		System.out.println("animals can walk");
	}
	
	public abstract void jump();
}
