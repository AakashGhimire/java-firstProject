package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		
		List<Integer> alist = new ArrayList<>();
		
		//List alist = new ArrayList(); // List is interface , contains duplicate value
		
		alist.add(20);
		alist.add(300);
		alist.add(200);
		alist.add(10);
		alist.add(10);
		alist.add(450);
		
		// Iteration is explicitly going inside ind elements and taking out.
		// Eg. [20, 300, 400, 10, 10, 450] -> access each element individually
		// And modify it.
		
		System.out.println("Iteration useing for-each loop");
		
		
		for(int element :alist) {
			
			System.out.println(element);
			
			System.out.println(element * 2); // modify each element
			
		}
		
		System.out.println("Iteration using for loop");
		
		for(int i = 0; i < alist.size(); i++) {
			
			System.out.println(alist.get(i));
			
		}
		
		// Iterator is to check any element in the list then 
		System.out.println("Iteration using ITERATOR");
		
		Iterator<Integer> itr = alist.iterator();
		
		// Is there any element in the list then print it
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
