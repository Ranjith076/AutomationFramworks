package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterators {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		//typical for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("---------------------------------------");
		
		// for each loop
		for(Object i : ar) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------");
		
		//JDK 8 - Streams with lambda
		ar.stream().forEach(ele -> System.out.println(ele));
		System.out.println("---------------------------------------");
		
		//Using iterator
		Iterator<Object> it = ar.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
