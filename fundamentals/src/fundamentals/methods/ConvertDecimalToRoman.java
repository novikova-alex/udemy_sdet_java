package fundamentals.methods;

import java.util.Scanner;

public class ConvertDecimalToRoman {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mainLoop: while (true) {
			System.out.print("Please, select mode. If you want to convert Roman "
					+ "numbers to decimal - type 'R2D' and press enter."
					+ System.lineSeparator()
					+ "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

			String mode = sc.next();
			if (mode.equalsIgnoreCase("R2D")) {
				while (true) {
					System.out.print("Please, enter Roman number you want to convert: ");
					String romanNumber = sc.next();
					if (isRomanNumberValid(romanNumber)) {
						System.out.println(roman2Decimal(romanNumber));
						break mainLoop;
					} else {
						System.out.println("You entered invalid Roman number. "
								+ "Please, try one more time.");
						continue;
					}
				}
			} else if (mode.equalsIgnoreCase("D2R")) {
				while (true) {
					System.out.print("Please, enter decimal number "
							+ "you want to convert: ");
					int decimalNumber = sc.nextInt();
					if (isDecimalNumberValid(decimalNumber)) {
						System.out.println(decimal2Roman(decimalNumber));
						break mainLoop;
					} else {
						System.out.println("Please, enter positive integer from 1 to 100.");
						continue;
					}

				}

			}
			
			System.out.println("Please, enter 'R2D' or 'D2R.");
		}
	}

	

	/**
	 * Converts decimal numbers to Roman.
	 * 
	 * Takes int value as a parameter. Works only with numbers from 1 to 100.
	 * 
	 * @param number to convert to Roman.
	 * @return string of Roman number.
	 */
	public static String decimal2Roman(int number) {
		String romanNumber = "";
		while(number > 0) {
			if (number == 100) {
				romanNumber += "C";
				number -= 100; 
			}
			else if (number >= 90) {
				romanNumber += "XC";
				number -= 90; 
			}
			else if (number >= 50) {
				romanNumber += "L";
				number -= 50; 
			}
			else if (number >= 40) {
				romanNumber += "XL";
				number -= 40; 
			}
			else if (number >= 10) {
				romanNumber += "X";
				number -= 10; 
			}
			else if (number >= 9) {
				romanNumber += "IX";
				number -= 9; 
			}
			else if (number >= 5) {
				romanNumber += "V";
				number -= 5; 
			}
			else if (number >= 4) {
				romanNumber += "IV";
				number -= 4; 
			}
			else if (number >= 1) {
				romanNumber += "I";
				number -= 1; 
			}
		}
		return romanNumber;
	}

	/**
	 * Converts Roman numbers to decimal.
	 * 
	 * Takes string value with Roman number as a parameter.
	 * 
	 * Method
	 * uses algorithm to convert Roman numeral to decimal.
	 * 
	 * @param romanNumber
	 * @return decimal representation of Roman number
	 */

	public static int roman2Decimal(String romanNumber) {
		int decimalNumber = 0;

		for(int i = romanNumber.length()-1; i >= 0; i--) {
			if(romanNumber.charAt(i) == 'I')
				decimalNumber += 1 * (decimalNumber >= 5 ? -1 : 1);
			else if (romanNumber.charAt(i) == 'V')
				decimalNumber += 5 * (decimalNumber >= 10 ? -1 : 1);
			else if (romanNumber.charAt(i) == 'X')
				decimalNumber += 10 * (decimalNumber >= 50 ? -1 : 1);
			else if (romanNumber.charAt(i) == 'L')
				decimalNumber += 50 * (decimalNumber >= 100 ? -1 : 1);
			if (romanNumber.charAt(i) == 'C') {
				decimalNumber =100;
				break;
			}
		}
		
		return decimalNumber;  
	}


	/**
	 * Validation for Roman numbers.
	 * 
	 * Use regular expression which is checking if string really could be Roman
	 * number.
	 * 
	 * @param romanNumber
	 * @return true if String is Roman number
	 */
	public static boolean isRomanNumberValid(String romanNumber) {
		if(romanNumber.isEmpty()) 
			return false;
	   if (!romanNumber.matches("[IVXLC]*")) 
		   return false;
	   return true;
	}
	
	
	/**
	 * Validation for Decimal numbers.
	 * 
	 * Use regular expression which is checking if string really could be Decimal
	 * number.
	 * 
	 * @param decimalNumber
	 * @return true if String is Roman number
	 */
	public static boolean isDecimalNumberValid(int decimalNumber) {
		if (decimalNumber > 100 || decimalNumber <= 0)
			   return false;
		   else return true;
	}
}