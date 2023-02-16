package stringAssignment;

// 2) Program to replace lower-case characters with upper-case and vice versa
public class ReplaceCharacter {

	public static void main(String[] args) {

		String character1 = new String("I LOVE JAVA");

		String toLowerCase = character1.toLowerCase();

		System.out.println("Character1 to Lower case: " + toLowerCase);

		System.out.println("*********************");

		String character2 = new String("hello world");

		String toUpperCase = character2.toUpperCase();

		System.out.println("Character1 to Lower case: " + toUpperCase);

	}

}
