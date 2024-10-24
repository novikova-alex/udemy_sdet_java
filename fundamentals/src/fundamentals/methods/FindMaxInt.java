package fundamentals.methods;

import java.util.Scanner;
import java.util.Arrays;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String input[]  = sc.nextLine().split("\\s+");
		int[] intArray = new int[input.length];
		int i = 0;
	    for(String el : input) {
	    	intArray[i] = Integer.valueOf(el);
	    	i++;
	    }
	    int maxInt = findMaxIntInArray(intArray);
	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int maxInt = intArray[0];
		for(int i = 1; i < intArray.length; i++) {
			if(intArray[i] > maxInt)
				maxInt = intArray[i];
		}
		return maxInt;
	}
}
