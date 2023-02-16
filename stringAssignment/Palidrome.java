package stringAssignment;

import java.util.Scanner;

//5) Program to Determine Whether a Given String is Palindrome

public class Palidrome {

	public static void main(String[] args) {
		
		System.out.println("Enter word: "); 
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine(); // user input
		
		char [] inputArray = s.toCharArray(); // convert string to character array
		
		int lengthOfInputCharArray = inputArray.length; // finding length of char to loop
		
		int flag = 0; // set flag to 0
		
		for(int i = 0; i < lengthOfInputCharArray / 2; i++) {
			
			if(inputArray[i] != inputArray[lengthOfInputCharArray - i - 1]) { 
				flag = 1;
				break;
			}
			
		}
		
		if (flag == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
		
		input.close();
	}

}
