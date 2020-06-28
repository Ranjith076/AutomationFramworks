package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		//ar.add("Selenium"); // Getting error as it allows only Integer
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Selenium"); 
		//ar1.add(10);// Getting error as it allows only String
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		Employee e1 = new Employee("Warner",30);
		Employee e2 = new Employee("Smith",30);
		Employee e3 = new Employee("Labuschgne",25);
		
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		Iterator<Employee>it = ar2.iterator();
		
		while(it.hasNext()){
			
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
		}
		System.out.println("**********ADD ALL ***********");
		// Add All
		
		ArrayList<Integer> ar3 = new ArrayList<Integer> ();
		ar3.add(1);
		ar3.add(2);
		ar3.add(3);
		
		ArrayList<Integer> ar4 = new ArrayList<Integer> ();
		ar4.add(4);
		ar4.add(5);
		ar4.add(6);
		
		ar3.addAll(ar4);
		
		for(int i=0;i<ar3.size();i++) {
			
			System.out.println(ar3.get(i));
		}
		
		System.out.println("**********REMOVE ALL ***********");
		
		ar3.removeAll(ar4);
		
		for(int i=0;i<ar3.size();i++) {
			
			System.out.println(ar3.get(i));
		}
		
		System.out.println("**********RETAIN ALL ************");
		
		ArrayList<Integer> ar5 = new ArrayList<Integer>();
		ar5.add(1);
		ar5.add(2);
		ar5.add(3);
		
		ArrayList<Integer> ar6 = new ArrayList<Integer>();
		ar6.add(3);
		ar6.add(4);
		ar6.add(5);
		
		ar5.retainAll(ar6);
		
		for(int i=0;i<ar5.size();i++) {
			
			System.out.println(ar5.get(i));
		}
		
	}
	
}
