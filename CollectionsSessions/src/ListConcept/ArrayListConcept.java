package ListConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		// Its a dynamic Array
		// Can contain duplicate values
		// Maintain Insertion order
		// Allows random access of elements because it stores the values on the basis of index

		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(30);
		
		System.out.println(ar.size()); // size of ArrayList
		System.out.println(ar.get(3)); // to get the value from an index
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		
		
		
		
		

	}

}
