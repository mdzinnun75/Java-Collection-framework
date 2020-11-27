package queue;

import java.util.Iterator;
import java.util.LinkedList;

public class demo2 {

	public static void main(String[] args) {
		
		LinkedList q= new LinkedList();
		
		//adding elements
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		q.offer("D");
		q.offer(100);									//it works for LinkedList, it supports heterogeneous data 
		
		System.out.println(q);	//[A, B, C, C, D, 100]		//duplicates allowed, insertion order preserved
		
		//--> returning head element
		System.out.println(q.element());	//A			//returns head element, if empty returns NoSuchElement
		System.out.println(q);
		
		
		System.out.println(q.peek());		//A			//returns head element, if empty returns Null
		System.out.println(q);
		

		//--> returning & removing head element
		System.out.println(q.remove());		//A			//returns & removes head element, if empty returns NoSuchElement
		System.out.println(q);
		
		System.out.println(q.poll());		//B			//returns & removes head element, if empty returns Null
		System.out.println(q);
		
		//--> returning elements using Iterator loop
		Iterator it= q.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
			
		}
		
	}
	}


