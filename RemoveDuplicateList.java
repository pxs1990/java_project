package codingInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateList {

	// Function to remove duplicates from an ArrayList
	public static <DT> ArrayList<DT> removeDuplicates(ArrayList<DT> list){

		// Create a new ArrayList
		ArrayList<DT> newList = new ArrayList<DT>();

		// adding unique element from the first list
		for (DT i : list) {
			if (!newList.contains(i)) {
				newList.add(i);
			}
		}
		return newList;
	}

	// Driver code
	public static void main(String args[])
	{

		// Get the ArrayList with duplicate values
		ArrayList<Integer>	list = new ArrayList<>(
				Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

		System.out.println("ArrayList with duplicates: "+ list);

		/*
		 * // Remove duplicates ArrayList<Integer> newList = removeDuplicates(list);
		 */

		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList without duplicates: "+ removeDuplicates(list));
		/*
		 * OR Set<T> set = new LinkedHashSet<>(); set.addAll(list); list.clear();
		 * list.addAll(set);
		 */
		/* addAll()method accepts collection argument. */
	
	
	}
}
