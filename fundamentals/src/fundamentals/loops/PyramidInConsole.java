package fundamentals.loops;

import java.util.Scanner;

public class PyramidInConsole {
	public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
        Scanner sc = new Scanner (System.in);
        int height = Integer.parseInt(sc.nextLine());
        
        for(int i = 1; i < height; i++) {
        	for (int j = i; j > 0; j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for(int i = height; i > 0; i--) {
        	for (int j = i; j > 0; j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }


}
