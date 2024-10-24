package fundamentals.methods;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;

public class MatrixRotation {
    
    public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = generateMatrix(size);

		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		rotateMatrix(matrix, mode);
	}
	
    public static double[][] generateMatrix(int size) throws ParseException{
    	double[][] matrix = new double[size][size];
    	for(int i = 0; i < size; i++)
    		for(int j = 0; j < size; j++) {
    			matrix[i][j] = round(new Random().nextDouble());
    		}
    	return matrix;   			
    }
    
    public static double round (double value) throws ParseException {
    	NumberFormat nf = NumberFormat.getInstance();
    	return nf.parse(String.format("%.1f", value)).doubleValue();
    }
    
    public static void printMatrixToConsole(double[][] matrix) {
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix.length; j++) {
    			System.out.print(matrix[i][j]+" ");
    		}
    		System.out.println();
    	}	
    }
    
	public static void rotate90(double[][] matrix) {
		String toString = new String();
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				toString += String.valueOf(matrix[i][j])+" ";
			}
			toString = toString.strip();
			String backwards = new String();
			for(int c = toString.length()-1; c>=0; c--) {
				backwards += toString.charAt(c);
			}
			System.out.println(backwards);
			toString = "";
		}
	}

	public static void rotate180(double[][] matrix) {
		double[][] newMatrix = new double[matrix.length][matrix.length];
		for(int i = matrix.length-1, j = 0; i >= 0; i--, j++ ) {
			for(int c = matrix.length-1, d = 0; c >= 0; c--, d++ ) {
				newMatrix[j][d] = matrix[i][c];
			}
		}
		printMatrixToConsole(newMatrix);
	}

	public static void rotate270(double[][] matrix) {//TODO
		double[][] newMatrix = new double[matrix.length][matrix.length];
		for(int i = 0, j = matrix.length-1; i < matrix.length; i++, j-- ) {
			for(int c = 0, d = matrix.length-1; c >= matrix.length; c++, d-- ) {
				newMatrix[j][d] = matrix[i][c];
				System.out.print(newMatrix[j][d]);
			}
		}
		printMatrixToConsole(newMatrix);
	}
	
	private static boolean rotateMatrix(double[][] matrix, int mode) {
		switch (mode) {
			case 1:
				System.out.println("90 degrees rotated:" + System.lineSeparator());
				rotate90(matrix);
				break;
			case 2:
				System.out.println("180 degrees rotated:" + System.lineSeparator());
				rotate180(matrix);
				break;
			case 3:
				System.out.println("270 degrees rotated:" + System.lineSeparator());
				rotate270(matrix);
				break;
			default:
				System.out.println("You selected non-existing mode!");
				return false;
			}
		return true;
	}

}