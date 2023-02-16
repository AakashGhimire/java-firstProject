package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// Storing, adding, pairing data-> Arraylist, is not syncronized
		//ArrayList arrlist = new ArrayList(); // Arraylist is class 
		
		// It can contain wrapper class, <> -> is generics(for type checking)
		List<Integer> alist = new ArrayList<>();
		
		//List alist = new ArrayList(); // List is interface , contains duplicate value
		
		alist.add(20);
		alist.add(300);
		alist.add(200);
		alist.add(10);
		alist.add(10);
		alist.add(450);
		
		// List interface can contain diff value(heterogenous)
		//alist.add("Roshan"); // But if we use generics we cannot use diff value
		
		System.out.println(alist);
		
		// To print first element
		System.out.println(alist.get(0)); // print 20
		
		// Gives boolean value
		System.out.println(alist.contains(300)); // Print True
		
		System.out.println(alist.contains(500)); // Print false
		
		//alist.sort(alist);
		
		// To SORT the list we use utility Class called Collections		
		Collections.sort(alist);
		
		// create list of Strings
		List<String> alist2 = new ArrayList<>();
		
		alist2.add("apple");
		alist2.add("Banana");
		
		
		// Control access of multiple threads() sycronized is needed --> Vector
		
	}

}
