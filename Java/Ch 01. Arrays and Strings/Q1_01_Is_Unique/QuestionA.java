package Q1_01_Is_Unique;

public class QuestionA {
	public static boolean isUniqueChars(String str) {

		return false;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}
