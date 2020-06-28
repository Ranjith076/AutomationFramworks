package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("Contents of ll :"+ ll); // to print ll elements
		
		ll.addFirst("Ranjith"); // To add first
		
		ll.addLast("Automation"); // To add last
		
		System.out.println("Contents of ll :"+ ll);
		
		System.out.println(ll.get(0)); // To get the indexed element
		
		ll.set(0, "Naveen");           // To set the element at specific index
		
		System.out.println("Contents of ll :"+ ll);
		
		ll.removeFirst(); // To Remove first element
		ll.removeLast();  // To Remove last element
		System.out.println("Contents of ll :"+ ll);
		
		ll.remove(2); // To Remove element of specific index
		System.out.println("Contents of ll :"+ ll);
		
		// To print all values of Linked List
		System.out.println("*** Using For loop ***");
		for(int i=0;i<ll.size();i++) {                  // Using For loop
			System.out.println(ll.get(i));
		}
		
		System.out.println("*** Using Advanced For loop ***");
		for(String str:ll) {							// Using Advanced For loop
			System.out.println(str);
		}
		
		System.out.println("*** Using Iterator ***");
		Iterator<String>it = ll.iterator();				// Using Iterator
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*** Using While loop ***");
		int num=0;
		while(ll.size()>num) {							// Using while loop
			
			System.out.println(ll.get(num));
			num++;
		}

	}

}
