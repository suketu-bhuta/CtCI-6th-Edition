package Q8_05_Recursive_Multiply;

public class QuestionB {

	public static int counter = 0;
	
	public static int minProduct(int a, int b) {
		return 0;
	}
	
	public static void main(String[] args) {
		int a = 13494;
		int b = 22323;
		int product = a * b;
		int minProduct = minProduct(a, b);
		if (product == minProduct) {
			System.out.println("Success: " + a + " * " + b + " = " + product);
		} else {
			System.out.println("Failure: " + a + " * " + b + " = " + product + " instead of " + minProduct);
		}
		System.out.println("Adds: " + counter);
	}

}
