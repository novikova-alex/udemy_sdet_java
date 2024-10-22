package fundamentals.controlStatements;

public class AddNumbers {

	public static void main(String[] args) {
		
        if (args[0].contains(".")||args[1].contains(".")) {
        	double param1 = Double.parseDouble(args[0]);
        	double param2 = Double.parseDouble(args[1]);
        	System.out.println(param1 + param2);
        }
        else  {
        	int param1 = Integer.parseInt(args[0]);
        	int param2 = Integer.parseInt(args[1]);
        	System.out.println(param1 + param2);
        }
	
	}
}
