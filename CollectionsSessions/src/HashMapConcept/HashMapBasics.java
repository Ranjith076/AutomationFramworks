package HashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//no ORDER and INDEXING
		//stores values -- Key - Value <k,v>
		//key can not be duplicate
		//can store n number of null values, but only one null key
		//hashmap is not thread safe- unsynchronized
		
		HashMap<String,String> capitalMap = new HashMap<String,String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London1");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("France",null);
		capitalMap.put("Italy",null);
		capitalMap.remove("France"); // To remove the particular value
		
		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get("UK")); // Prints latest value
		
		System.out.println(capitalMap.get(null)); // Prints latest value
		System.out.println(capitalMap.get("France"));
		
		//iterator: over the keys : by using keySet()
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("Key: "+key+" Value: "+value);
			
		}
		
		System.out.println("------------------------------------------------------");
		
		//iterator: over the set(pair): by using entrySet
		
		Iterator<Entry<String,String>> it1 = capitalMap.entrySet().iterator();
		
		while(it1.hasNext()) {
			
			Entry<String,String> entry = it1.next();
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("------------------------------------------------------");
		
		//iterate hashMap using java 8 for each and lambda:
		capitalMap.forEach((k,v)->System.out.println("Key: "+k+" Value:"+v));;
		

	}

}
