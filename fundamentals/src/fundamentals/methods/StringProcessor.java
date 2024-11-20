package fundamentals.methods;

public class StringProcessor {
	 public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
				"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
				"james;Derek James;james@gmail.com" + System.lineSeparator() +
				"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
				"gregory;Mike Gregory;gregory@yahoo.com";
		
		public static void main(String[] args) {
			System.out.println("===== Convert 1 demo =====");
			System.out.println(convert1(INPUT_DATA));
			
			System.out.println("===== Convert 2 demo =====");
			System.out.println(convert2(INPUT_DATA));
			
		}
		
		public static String convert1(String input) {
			String [] strings = input.split("\\n"); 
			String output = "";
			for(int i = 1; i < strings.length; i++) {
				output += strings[i].split(";")[0] + " ==> " + strings[i].split(";")[2].trim();
				output += System.lineSeparator();
			}
			return output;
		
		}
		
		
		public static String convert2(String input) {
			String [] strings = input.split("\\n");
			String output = "";
			for(int i = 1; i < strings.length; i++) {
				output += strings[i].split(";")[1] +" (email: " + strings[i].split(";")[2].trim() + ")";
				output += System.lineSeparator();
			}
			return output;
		
		}
}
