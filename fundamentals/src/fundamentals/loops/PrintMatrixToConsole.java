package fundamentals.loops;

public class PrintMatrixToConsole {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
		for (int[] is : matrix) {
			for (int el : is) {
				System.out.print(el + " ");
			}
			System.out.println();
		}
	}

}
