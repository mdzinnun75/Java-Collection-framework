package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class demo1 {

	public static void main(String[] args) {


		HashSet hs= new HashSet();	//default capacity 16, load factor .75
		
		HashSet hs1= new HashSet(100);	//initial capacity 100
		
		HashSet hs2= new HashSet(100, (float)0.90);
		
		HashSet<Integer> hs3= new HashSet<Integer>(); 
		
		
		
		///add elements into hashset
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);		//[null, A, 100, 16.4, welcome, true] ; insertion order not preserved
		
		//remove
		hs.remove(16.4);
		
		//after removing element
		System.out.println("after removing element -"+hs);
		
		//contains
		System.out.println(hs.contains("welcome"));
		System.out.println(hs.contains(36.4));
		
		//isEmpty()
		System.out.println(hs.isEmpty());
		
		//getting values using enhanced for loop
		for(Object e: hs) {
			System.out.println(e);
		}
		
		//getting values using Iterator method
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
