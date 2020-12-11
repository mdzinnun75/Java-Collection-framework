package mapHashTable;

import java.util.Hashtable;
import java.util.Map;

public class demo1 {
	public static void main(String[] args) {
		
		
		//Hashtable ht = new Hashtable();	//capaciy is 11, load factor is 0.75
		//Hashtable ht = new Hashtable(); 	//create hahtable object with some initial capacity
		//Hashtable ht = new Hashtable(initial capacity, fill ratio/load factor);
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(101, "John");
		ht.put(102, "David");
		ht.put(103, "Smith");
		ht.put(104, "Kohen");
		//ht.put(null, "x");			//will throw nullPointerException
		//ht.put(105, null);			//will throw nullPointerException
		
		System.out.println(ht);			//{104=Kohen, 103=Smith, 102=David, 101=John}
		
		//retrieving value
		String value= ht.get(103);
		System.out.println("value of 103: "+value);		//value of 103: Smith
		
		//removing pair
		System.out.println("value to be removed: "+ht.remove(104));		//value to be removed: Kohen
		System.out.println("after removing: "+ht);						//after removing: {103=Smith, 102=David, 101=John}
		
		//containsKey() 
		System.out.println(ht.containsKey(101));		//true
		System.out.println(ht.containsKey(104));		//false
		
		//containsValue()
		System.out.println(ht.containsValue("John"));	//true
		System.out.println(ht.containsValue("Y"));		//false
		
		//isEmpty()
		System.out.println(ht.isEmpty());		//false
		
		//retrieving keys & values  
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		
		System.out.println("--------------------");
		
		//returning value using enhanced for loop
		for (int k:ht.keySet()) {
			System.out.println(k+ " "+ ht.get(k));
		}
		
		
		System.out.println("--------------------");
		
		//returning value using Map.Entry
		for(Map.Entry entry: ht.entrySet())
		{
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
