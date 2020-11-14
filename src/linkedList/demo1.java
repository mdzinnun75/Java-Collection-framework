package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class demo1 {

	public static void main(String[] args) {


		//Declare LinkedList
		//LinkedList l= new LinkedList();
		//LinkedList<Integer> l= new LinkedList<Integer>();
		
		LinkedList l= new LinkedList();
		
		//add elements into LinkedList
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size());
		
		//remove
		l.remove(3);
		//l.remove(100);   							//it's not allowed, it'll throw "IndexOutOfBoundsException" 
		System.out.println("after removing: "+ l);
		System.out.println("after removing size is- "+ l.size());
		
		//adding in middle 
		l.add(3, "Java");
		System.out.println("after inserting element, new list is "+ l);
		
		//retrieving value/object
		System.out.println(l.get(2));
		
		//replacing/chnging value
		l.set(5, "x");
		System.out.println("after changing value: "+l);
		
		//contains
		System.out.println(l.contains("Java"));
		System.out.println(l.contains("Python"));
		
		//isEmpty()
		System.out.println(l.isEmpty());
		
		//reading object from LL using for loop
		for (int i = 0; i < l.size(); i++) {
			l.get(i);
			}
		
		//reading object from LL using for..each loop
		for(Object i:l)
			
		{
			
			System.out.print( i+" ");
		}
		
		System.out.println();
		
		
		// Iterator() method
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+ " ");
		}
		
		
	}

}
