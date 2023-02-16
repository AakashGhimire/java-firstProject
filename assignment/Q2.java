package assignment;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 	System.out.print("Enter Integer value: ");
	        int i = scan.nextInt();
	        
	        System.out.print("Enter Double value: ");
	        double d = scan.nextDouble();
	        scan.nextLine();
	        System.out.print("Enter String value: ");
	        String s = scan.nextLine();
	        
	       

	        // Write your code here.
	        
	        scan.nextLine();

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);

	}

}
