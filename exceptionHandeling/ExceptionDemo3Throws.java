package exceptionHandeling;

import java.util.Scanner;
// Throws keyword, we use in methods
public class ExceptionDemo3Throws {
	
	static String takeInput() throws Exception{
		
				System.out.println("Enter name ");
				Scanner scan = new Scanner(System.in);
				
				String enteredName = scan.next();
				
				if("Roshan".equals(enteredName)) {
					
					Exception exception = new Exception("Roshan is not allowed");
					
					throw exception;
					
				}
				return enteredName;
		
	}

	public static void main(String[] args) {
		

		String enteredName = null;
		
		try {
			enteredName = takeInput();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.println("Welcome " + enteredName);
		
		System.out.println("Thank you!!");
		
	}
}
