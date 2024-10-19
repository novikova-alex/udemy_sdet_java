package fundamentals.string;


public class PINumberFormatting {
	public static void main(String[] args) {
		for(int i=1; i<6; i++) 
			System.out.printf("%."+i+"f%n", Math.PI);
			
	}
}
