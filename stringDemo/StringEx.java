package stringDemo;

public class StringEx {

	public static void main(String[] args) {

		String s1 = "Roshan";// string literals
		
		String s2 = new String("Rosh"); // new keyword
		
		String s3 = "Roshan";
		
		String s4 = new String ("Rosh");
		
		String s5 = "Hello World";
		
		System.out.println(s2 == s4);
		
		System.out.println(s3 == s4);
		
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s3));

		System.out.println(s2.equals(s4));
		
		System.out.println(2+3+s1+2);
		
		System.out.println(2+3+s1+2+3);//string + int becomes string
		
		// Java string predefined methods
		
		//length method
		System.out.println(s2.length()); //4
		
		
		
		System.out.println(s5.length()); // 11
		
		//Substring Method
		System.out.println(s5.substring(4)); // start from 4th index

		//charAt()

		System.out.println(s1.charAt(3));
		
		//Last Character
		System.out.println(s2.charAt(s2.length()-1));


		//For creating and menipulating mutable string, jav provides 2 classes
		//StringBuilder(more efficiant)
		//StringBuffer(for multithreading)








	}

}
