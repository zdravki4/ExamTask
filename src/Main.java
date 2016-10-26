import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Setting up size of a two dimensional quadratic matrix;
		System.out.println("Insert size of matrix between 2 and 9:");
		int sizeMatrix = input.nextInt();

		// Loops until user inputs integer between given boundaries;
		while (sizeMatrix < 2 || sizeMatrix > 10) {
			System.out.print("Insert the number beetween 2 and 9:");
			sizeMatrix = input.nextInt();

		}

		int[][] matrix = new int[sizeMatrix][sizeMatrix];

		// Length of one dimensional array
		int lenghtArray = sizeMatrix * sizeMatrix;

		int[] array = new int[lenghtArray];

		// Filling in one dimensional array
		for (int i = 0; i < array.length; i++) {
			System.out.println("Input an integer number: ");
			array[i] = input.nextInt();
		}
		// System.out.println(Arrays.toString(array));

		// Default value of sum of all items in one dimensional massive
		int sum = 0;

		// Calculating the sum of all items in array
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("One dimensional array is: " + Arrays.toString(array));
		System.out.println("The sum of the one dimensional array is: " + sum);
		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				matrix[j][i] = array[i + 2];
//
//			}
//
//		}		
		System.out.println(Arrays.deepToString(matrix));

	}

}
