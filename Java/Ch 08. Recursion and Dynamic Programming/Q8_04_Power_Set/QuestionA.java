package Q8_04_Power_Set;

import java.util.*;

public class QuestionA {

	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index) {

		return null;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			list.add(i);
		}
		ArrayList<ArrayList<Integer>> subsets = getSubsets(list, 0);
		System.out.println(subsets.toString());	
	}

}
