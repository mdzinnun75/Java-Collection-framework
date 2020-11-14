package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class demo1 {

	public static void main(String[] args) {


		//declare arraylist
		//ArrayList al= new ArrayList();							heteragenous data
		
		//ArrayList <Integer> al= new ArrayList<Integer>();			homogenous data
		//ArrayList <String> al= new ArrayList<String>();			homogenous data
		//List al=new ArrayList();									List interface is the parent interface of ArrayList
		
		ArrayList al= new ArrayList();
		al.add(100);
		al.add(15.5);
		al.add("welcome");
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		//size
		System.out.println("size of the arrayList :" +al.size());
		
		//remove element	
		
		al.remove(1);			//remove using index no.
		al.remove("welcome");	//remove using element
		
		System.out.println("after removing element arraylist : "+ al); // [100, A, true]
		
		//insert a new element 
		
		al.add(2, "Python");
		
		System.out.println("after insertion arraylist: "+ al);			//[100, A, Python, true]
		
		//Retrieve specific element
		System.out.println(al.get(2));
		
		//replace element
		al.set(2, "C#");
		System.out.println("after replacing element: "+al);
		
		//search -contains()	-Return true/false
		System.out.println(al.contains("C#"));//true				//verify element is present or not
		
		//isEmpty()	-Return true/false
		System.out.println(al.isEmpty());	//false
		
		//for loop
		System.out.println("Reading result using for loop: ");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		
		//for ..each loop
		System.out.println("Reading result using for ..each loop: ");
		for (Object e : al) {
			System.out.println(e);
		}
		
		
		//iterator() -collection interface
		System.out.println("Reading data using iterator method: ");
		Iterator it= al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
