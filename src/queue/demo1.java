package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class demo1 {

	public static void main(String[] args) {

		PriorityQueue q= new PriorityQueue();
		
		//adding elements
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		q.offer("D");
		
		System.out.println(q);	//[A, B, C, D]			//duplicates allowed, insertion order preserved
		
		//--> returning head element
		System.out.println(q.element());	//A			//returns head element, if empty returns NoSuchElement
		System.out.println(q);
		
		
		System.out.println(q.peek());		//A			//returns head element, if empty returns Null
		System.out.println(q);
		

		//--> returning & removing head element
		System.out.println(q.remove());					//returns & removes head element, if empty returns NoSuchElement
		System.out.println(q);
		
		System.out.println(q.poll());					//returns & removes head element, if empty returns Null
		System.out.println(q);
		
		//--> returning elements using Iterator loop
		Iterator it= q.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
			
		}
		
	}

}
