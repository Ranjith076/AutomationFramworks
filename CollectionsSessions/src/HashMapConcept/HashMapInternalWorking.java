package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalWorking {

	public static void main(String[] args) {
		
		Map<String,Integer> marks = new HashMap<String,Integer>();
		marks.put("Naveen",100);
		marks.put("Ranjith", 200);
		marks.put("Jason", 300);
		marks.put("ABD",360);
		marks.put("Maxi",500);
		
		marks.put(null,400);
		marks.put(null,700);
		
		System.out.println(marks.get("ABD"));
		
		// HashCode of ABD -> 210678
		// index = 15
		//.equals to check the key name
		//Return the value

	}

}
