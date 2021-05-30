package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//default class
		//dynamic Array
		
		//default generics:
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add('t');
		ar.add(12.33);
		ar.add(true);
		
		System.out.println(ar); // To print entire arrayList elements
		
		System.out.println(ar.get(2)); // To print arrayList value at particular index
		
		System.out.println(ar.size()); // To Print size of an arrayList
		
		
		
		
		

	}

}
