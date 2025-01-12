package fundamentals.ocp;

import java.util.List;


public class ShapeCalculator {
	public static double calculateTotalArea(List<Shape> shapes) {
		 double totalArea = 0;
	        for (Shape shape : shapes) {
	        	if(shape != null)
	        		totalArea += shape.calculateArea();
	            // Add more conditions for other shapes (e.g., Triangle)
	        }
	        return totalArea;
	}	
}

