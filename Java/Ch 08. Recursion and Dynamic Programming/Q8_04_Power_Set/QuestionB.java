package Q8_04_Power_Set;

import java.util.*;

public class QuestionB {
	
	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {

		return null;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			list.add(i);
		}
		
		ArrayList<ArrayList<Integer>> subsets2 = getSubsets(list);
		System.out.println(subsets2.toString());		
	}

}
