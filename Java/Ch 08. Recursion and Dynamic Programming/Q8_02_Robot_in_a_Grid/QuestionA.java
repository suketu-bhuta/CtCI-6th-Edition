package Q8_02_Robot_in_a_Grid;

import java.util.ArrayList;

import CtCILibrary.AssortedMethods;

public class QuestionA {
	
	public static ArrayList<Point> getPath(boolean[][] maze) {

		return null;
	}
	
	public static void main(String[] args) {
		int size = 5;
		boolean[][] maze = AssortedMethods.randomBooleanMatrix(size, size, 70);
		
		AssortedMethods.printMatrix(maze);
		
		ArrayList<Point> path = getPath(maze);
		if (path != null) {
			System.out.println(path.toString());
		} else {
			System.out.println("No path found.");
		}
	}

}
