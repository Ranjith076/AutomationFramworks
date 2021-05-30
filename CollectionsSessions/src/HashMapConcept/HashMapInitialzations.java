package HashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialzations {
	
	public static Map<String,Integer> marksMap;
	
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
		marksMap.put("C", 300);
	}

	public static void main(String[] args) {
		
		//1. Using HashMap Class
		HashMap<String,Integer> map1 = new HashMap<>();
		Map<String,Integer> map2 = new HashMap<>();
		
		//2. Static way: static hashMap
		System.out.println(HashMapInitialzations.marksMap.get("A"));
		
		//3. Immutable with Only Single entry
		Map<String,Integer> map3 = Collections.singletonMap("ABD", 360);
		System.out.println(map3.get("ABD"));
		//map3.put("RCB",2); ----> Throws UnsupportedOperationException
		
		//4. JDK 1.8
		// creating 1 2D Array of Strings using Stream and collecting in the form of Map
		Map<String,String> map4 = Stream.of(new String[][] {
			{"Tom","A Grade"},
			{"Naveen","A+ Grade"}
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("Tom"));
		map4.put("Lisa","Ann");
		System.out.println(map4.get("Lisa"));
		
		
	}

}
