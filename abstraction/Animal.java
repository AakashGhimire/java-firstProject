package abstraction;

//purpose - reusability of code
public abstract class Animal {
	
	public void run() {
		System.out.println("animals cannot run");
	}
	
	public abstract void jump();
}
