package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,7,6,7));
		
		//1. LinkedHashSet
		LinkedHashSet<Integer> distinctNumbers = new LinkedHashSet<Integer>(numbers);
		System.out.println(distinctNumbers);
		
		//2. JDK 8 Stream
		
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,7,6,7));
		List<Integer> uniqueMarks = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueMarks);
	}

}
