package fundamentals.loops;

import java.util.Scanner;

public class NewLineForDigit {
	public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine();
		
		for (int i=0; i<input.length(); i++) {
			if(Character.isDigit(input.charAt(i)))
				System.out.println(input.charAt(i));
		}
    }

}
