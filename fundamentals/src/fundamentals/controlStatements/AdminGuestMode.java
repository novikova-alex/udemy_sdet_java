package fundamentals.controlStatements;

public class AdminGuestMode {
	public static void main (String[] args) {
		
		String result = String.join(",", args);
		
		
		if (result.contains("--guest")&&result.contains("--admin")) 
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		else if (result.contains("--admin"))
			System.out.println("Hello, Admin!");
		else if (result.contains("--guest"))
			System.out.println("Hello, Guest!");
			
	}
}
