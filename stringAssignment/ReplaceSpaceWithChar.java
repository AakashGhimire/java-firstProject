package stringAssignment;


//3) Program to replace the spaces of a string with a specific character
//4) Program to Count the Total Number of Characters in a String

public class ReplaceSpaceWithChar {

	public static void main(String[] args) {
		
		String spaceWithChar = new String("Removing space with Character R");
		
		String character = spaceWithChar.replaceAll("\\s","R"); //replaceAll() methods only takes two string
		
		System.out.println("Modified string is: " + character);
		
		System.out.println("*******************");
		
		int countLengthOfString = character.length();
		
		System.out.println("Length of string is: " + countLengthOfString);

	}

}
