package fundamentals.methods;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		String[] filteredWords = new String[words.length];
		int i=0;
		for (String string : words) {
			if (string.length() >= minLength) {
				filteredWords[i]=string;
				i++;
			}	
		}
		filteredWords = filterNulls(filteredWords);
		return filteredWords;
	}
	
	public static String[] filterNulls(String[] filteredWords) {
		int arraySize = 0; 
		for (String string : filteredWords) {
			if(string != null)
				arraySize++;
		}
		String[] filteredNulls = new String [arraySize];
		int i = 0;
		for(String string : filteredWords) {
			if(string != null) {
				filteredNulls[i] = string;
				i++;
			}
		}
		return filteredNulls;
	}
}
