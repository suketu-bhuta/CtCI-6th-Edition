package Q8_02_Robot_in_a_Grid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import CtCILibrary.AssortedMethods;

public class QuestionB {
	public static ArrayList<Point> getPath(boolean[][] maze) {
		return null;
	}
	
	public static void main(String[] args) {
		int size = 20;
		boolean[][] maze = AssortedMethods.randomBooleanMatrix(size, size, 60);
		
		AssortedMethods.printMatrix(maze);
		
		ArrayList<Point> path = getPath(maze);
		if (path != null) {
			System.out.println(path.toString());
		} else {
			System.out.println("No path found.");
		}
	}

}
