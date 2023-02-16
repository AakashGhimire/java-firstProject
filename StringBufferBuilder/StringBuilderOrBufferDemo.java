package StringBufferBuilder;


// It is used to manipulate Object

//String builder or buffer can be created by using NEW keyword
//String Builder is more faster/faster then StringBuffer
public class StringBuilderOrBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Hello");
		
		//Insert operation
		System.out.println(sb.insert(3, "Mohan"));
		
		//This will replace 1st index to hi
		System.out.println(sb.insert(1, " Hi "));
		
		//add string
		System.out.println(sb.append(" java "));
		
		//delete specified index
		System.out.println(sb.delete(0, 3));
		
		//Reverse method is available in StringBuffer/Builder only
		//Reverse method is not available in String class
		System.out.println(sb.reverse());
		
		
		//Convert from to Mutable to Imutable Object using toString
		// 
		String s = sb.toString();
		
		StringBuilder sb1 = new StringBuilder("Roshan");
		
		StringBuilder sb2 = new StringBuilder("Roshan");
		
		
		//equal() - equals()  compares objects by contents if that class
	 // false as equals() is not overRidden, so it compares addresses		
		System.out.println(sb1.equals(sb2));
		
		// to overRide two string we use toString()
		
		String s1 = sb2.toString();
		String s2 = sb2.toString();
		
		// true as String class overrides equals()
		System.out.println(s1.equals(s2));
		
	}

}
