package hashSet;

import java.util.HashSet;

public class demo2 {

	public static void main(String[] args) {

		//union, intersection, difference
		HashSet<Integer> set1= new  HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("hashset 1: "+set1);
		
		HashSet<Integer> set2= new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		System.out.println("hashset 2: "+ set2);
		
		//union
		//set1.addAll(set2);
		System.out.println("union: "+set1);	//[1, 2, 3, 4, 5]
		
		//intersection
		//set1.retainAll(set2);
		System.out.println("intersection: "+set1);	//[3, 4, 5]
		
		//difference
		//set1.removeAll(set2);
		System.out.println("difference "+ set1);	//[1, 2]
		
		//subset
		System.out.println(set1.containsAll(set2));
		//System.out.println("subset: "+set1);	//[1, 2, 3, 4, 5]
		
	}

}
