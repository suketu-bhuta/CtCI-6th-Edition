package Q1_07_Rotate_Matrix;

import CtCILibrary.*;

public class Question {

	public static boolean rotate(int[][] matrix) {

		return true;
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}

}
