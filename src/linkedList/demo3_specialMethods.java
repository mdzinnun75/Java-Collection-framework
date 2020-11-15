package linkedList;

import java.util.LinkedList;

public class demo3_specialMethods {

	public static void main(String[] args) {


		LinkedList l= new LinkedList();
		
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		
		
		//after adding elements
		System.out.println(l);
		
		//adding first & last element
		l.addFirst("Tiger");
		l.addLast("elephant");
		
		System.out.println("after adding first & last element: "+l);
		
		//getting first & last element
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//removing first & last element
		l.removeFirst();
		l.removeLast();
		System.out.println("after removing first & last element: "+l);
	}

}
