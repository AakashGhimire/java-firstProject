package inheritanceEx1;

public class SubClass extends SuperClass{
	

	int height;
	String hobby = "FrontEnd Developer."; // static variable
	
	
	public void height() {		
		height = 140;
		System.out.println("Height of child is: " + height);		
	}	
	
	//Using parents method with diff behaviour using inheritance 
	// Call method overRiding.
	public void hobby() {		
		System.out.println("Child Work: " + hobby);
		
	}

}
