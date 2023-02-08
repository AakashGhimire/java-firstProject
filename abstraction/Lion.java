package abstraction;

public class Lion extends Animal{

	public static void main(String[] args) {
		Lion lion = new Lion();
		 lion.run();
		 lion.jump();
		
		

	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Lion can jump");
		
	}

}
