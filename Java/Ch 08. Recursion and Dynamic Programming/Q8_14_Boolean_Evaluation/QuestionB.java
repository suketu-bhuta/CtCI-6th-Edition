package Q8_14_Boolean_Evaluation;

import java.util.HashMap;

public class QuestionB {
	
	public static int count = 0;
	public static boolean stringToBool(String c) {
		return c.equals("1") ? true : false;
	}
	
	public static int countEval(String s, boolean result, HashMap<String, Integer> memo) {

		return 0;
	}
	
	public static int countEval(String s, boolean result) {
		return countEval(s, result, new HashMap<String, Integer>());
	}
	
	public static void main(String[] args) {
		String expression = "0^0|1&1^1|0|1";
		boolean result = true;
		
		System.out.println(countEval(expression, result));
		System.out.println(count);
	}

}
