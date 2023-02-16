package exceptionHandeling;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name ");
		Scanner scan = new Scanner(System.in);
		
		String enteredName = scan.next();
		try {
			if("Roshan".equals(enteredName)) {
				
				Exception exception = new Exception("Roshan is not allowed");
				
				throw exception;
				
				}
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.println("Welcome " + enteredName);
		System.out.println("Thanks....");
	}
	
}
