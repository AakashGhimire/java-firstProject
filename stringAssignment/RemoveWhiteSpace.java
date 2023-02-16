package stringAssignment;

//1: Program to remove all the white spaces from a string
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = new String("    I    love    java");

		System.out.println("Removing white space :" + name.replaceAll("\\s", "")); // replace method takes two arguments

	}

}
