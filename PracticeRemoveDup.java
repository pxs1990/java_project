package codingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeRemoveDup {
	public static List<Integer> removeDup(List<Integer> gList) {
		List<Integer> newList=new ArrayList();
		for(int i : gList) {
			if(!newList.contains(i)) {
				newList.add(i);
				
			}
		}
	return newList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> givenList= new ArrayList(Arrays.asList(1,2,3,4,2,3,5,6));
		System.out.println(removeDup(givenList));
	}

}
