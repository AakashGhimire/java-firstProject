package inheritanceEx1;

public class SuperClass {
	

	//define field or data member OR Instance Variable.
	int height;  // instance variable get memory in runtime.
	String eye = "green";
	String hobby = "BackEnd Developer.";

	
	public void height(){
	  height = 150;
	  System.out.println("Father height is: " + height);
	}
	
	public void hobby() {		
		System.out.println("Father work: " + hobby);
	}
	

}
