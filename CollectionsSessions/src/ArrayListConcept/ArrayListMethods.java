package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Ruby");
		ar1.add("Java Script");
		ar1.add("Python");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Dev Ops");
		
//		ar1.addAll(ar2); --------> Concatinating ArrayList
//		System.out.println(ar1);
		
//		ar1.addAll(2,ar2); --------> Concatinating ArrayList at particular index
//		System.out.println(ar1);
		
//		ar1.clear(); -------------> Emptying of AarayList
//		System.out.println(ar1);
		
		ArrayList<String> cloneList=(ArrayList<String>)ar1.clone(); // Arraylist Cloning
		System.out.println(cloneList);
		
		System.out.println(ar1.contains("Java")); // ArrayList Contains
		System.out.println(ar1.contains("C"));
		System.out.println(ar1.indexOf("Ruby")); // To print index of particulat element
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Naveen","Steve","Lisa","Naveen"));
		System.out.println(list1);
		
		int i = list1.lastIndexOf("Naveen"); // To get the last index of particular string
		System.out.println(i);
		
		list1.remove(1); // To remove the element at particular index
		System.out.println(list1);
		
		list1.remove("Lisa"); // To remove the element of particular string
		System.out.println(list1);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2==0);
		System.out.println(numbers); // To remove numbers on particular conditions
		
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Naveen","Steve","Lisa","Naveen"));
		
		System.out.println(nameList);
		
		nameList.retainAll(Collections.singleton("Naveen")); // To retain only required string
		System.out.println(nameList);
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 6)); // To Print a sublist
		System.out.println(subList);
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa","Robert"));
		
		Object arr[] = newList.toArray(); // To covert arraylist to Object
		System.out.println(Arrays.toString(arr));
		
		for(Object o : arr) {
			System.out.println((String)o);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
