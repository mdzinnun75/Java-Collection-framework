package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class demo3 {

	public static void main(String[] args) {

		//array
		String arr[]= {"dog", "cat","elephant"};
		for (String value : arr) {
			System.out.println(value);
			
		}
		
		
		//converting array into ArrayList
		ArrayList al=new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);
	}

}
