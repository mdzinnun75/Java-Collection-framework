package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class demo2 {

	public static void main(String[] args) {


		ArrayList al= new ArrayList();

		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		al_dup.removeAll(al);
		System.out.println("after removing: "+al_dup); 	//empty now
		
		//Sort -- collections.sort()
		System.out.println("elements before sorting: "+al);
		Collections.sort(al);
		System.out.println("elements after sorting: "+al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("element after reverse sorting: "+ al);
		
		//Shuffling 
		//Collections.shuffle(al);
		//System.out.println("elements after shuffling: "+al);
		
		Collections.shuffle(al);
		System.out.println("elements after shuffling: "+al);
	}

}
