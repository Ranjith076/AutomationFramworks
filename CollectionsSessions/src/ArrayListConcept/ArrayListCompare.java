package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		//1. Sort and then equals
		
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6));
		ArrayList<Integer> l3 = new ArrayList<Integer>(Arrays.asList(5,3,4,2,1));
		
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		//2. compare two list - find out the additional elements
		ArrayList<Integer> l4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> l5 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6));
		
		l4.removeAll(l5);
		System.out.println(l4);
		
		//3. find the common elements
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java","Python","C#","Groovy"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java","Python","C#","PHP"));
		
		lang2.retainAll(lang1);
		
		System.out.println(lang1);
		

	}

}
