package fundamentals.methods;

import java.util.Scanner;

public class EmptyRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();

		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		for (int i = 0; i < height; i++) {
			if (i == 0 || i == height-1) {
				for (int j = 0; j < width; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				System.out.print("*");
				for (int j = 1; j < width-1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
	}

}
