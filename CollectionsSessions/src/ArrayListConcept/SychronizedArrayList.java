package ArrayListConcept;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SychronizedArrayList {

	public static void main(String[] args) {
		
		//1. Collections.synchronizedList
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
		//add or remove - no need explicit synchronization
		
		//Fetch or traverse the values from list - need explicit synchronization
		
		synchronized (namesList) {
			
			Iterator<String> it = namesList.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		//2. copyOnWriteArrayList -- its a class : Thread-safe/synchronized already
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Allen");
		
		// No need explicit synchronization for any operation: add/remove/traverse
		
		Iterator<String> it1 = empList.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
