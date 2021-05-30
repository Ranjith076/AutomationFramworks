package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		
		// The Virtual Capacity of ArrayList is '10'
		// The Virtual Capacity of ArrayList is increased by passing the value during ArrList declaration
		// Ex: ArrayList<Object> ar = new ArrayList<Object>(20);
		
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(10);
		
		System.out.println(ar.get(0));
		

	}

}
