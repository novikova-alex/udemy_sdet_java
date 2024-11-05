package fundamentals.methods;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		int sum = 0;
		String numberString = String.valueOf(number);
		for(int i = 0; i < numberString.length(); i++) {
			if(numberString.charAt(i) == '-') continue;
			sum += Integer.parseInt(numberString.substring(i, i+1));
		}
		return sum;
	}
	}
