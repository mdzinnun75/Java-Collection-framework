package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class demo2 {

	public static void main(String[] args) {


		LinkedList l= new LinkedList();
		
		l.add("x");
		l.add("y");
		l.add("z");
		l.add("a");
		l.add("b");
		l.add("c");
		
		//adding data from another linked list
		LinkedList new_l= new LinkedList();
		new_l.addAll(l);
		
		System.out.println(new_l);
		
		new_l.removeAll(l);
		System.out.println(new_l);
		
		//sortings
		Collections.sort(l);
		System.out.println(l);
	}

}
