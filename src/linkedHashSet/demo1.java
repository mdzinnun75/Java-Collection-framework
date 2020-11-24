package linkedHashSet;

import java.util.LinkedHashSet;

public class demo1 {

	public static void main(String[] args) {

		//HashSet lhs= new HashSet();
		LinkedHashSet lhs= new LinkedHashSet();
		//LinkedHashSet<Integer> lhs= new LinkedHashSet<Integer>();
		
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		
		System.out.println(lhs);
	}

}
