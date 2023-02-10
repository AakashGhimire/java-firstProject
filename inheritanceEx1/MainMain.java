package inheritanceEx1;

public class MainMain {

	public static void main(String[] args) {
		

		//Creating Objects or instance of Parents
		SuperClass par = new SuperClass();
		par.hobby();		
		par.height();
		System.out.println();
		
		SubClass ch = new SubClass();
		ch.hobby();
		ch.height();
		System.out.println();
		
		//upcasting		
		SuperClass pc = new SubClass();
		
		///((Child) pc).Parents();
		

	}

}
