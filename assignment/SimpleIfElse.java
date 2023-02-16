package assignment;

import java.util.Scanner;

public class SimpleIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.print("Enter number: ");
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if((N % 2 == 0 && N > 20) && N > 2 || N < 5){
        	
            
                System.out.println("Not Weird");
           
            System.out.println("Milena Even!!");
            
        }else if(N%2 == 1 || N >= 6 && N <=20){
        	
	            
	                System.out.println("Weird");
	          
        	System.out.println("Milena ODD!!");
        }
        
        System.out.println("Na Even Na ODD!!");
        scanner.close();


	}

}
