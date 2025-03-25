package presentsManagement;

import java.util.Arrays;

public class Present {
	private static final int DEFAULT_GIFT_CAPACITY = 10;
	private Sweet[] sweets;
	private int lastIndexAdded;

	{
		sweets = new Sweet[DEFAULT_GIFT_CAPACITY];
		lastIndexAdded = 0; 
	}

    public void addSweet(Sweet sweet) {
    	if (lastIndexAdded < 10 && sweet != null) {
    		sweets[lastIndexAdded] = sweet; 
    		lastIndexAdded++;
    	}
	}

	public double calculateTotalWeight() {
		double totalWeight = 0;
		for(int i = 0; i < lastIndexAdded; i++) {
			totalWeight += sweets[i].getWeight();
		}
		return totalWeight;
	}

	public Sweet[] filterSweetsBySugarRange(double minSugarWeight,
			double maxSugarWeight) {
	    Sweet[] filteredSweets = new Sweet[DEFAULT_GIFT_CAPACITY];
	    int lengthFilteredSweetsArray = 0;
	    for(int i = 0; i < lastIndexAdded; i++) {
	    	if (sweets[i].getSugarWeight() >= minSugarWeight && sweets[i].getSugarWeight() <= maxSugarWeight) {
	    		filteredSweets[lengthFilteredSweetsArray] = sweets[i];
	    		lengthFilteredSweetsArray++;
	    	}
	    }
	    return Arrays.copyOf(filteredSweets, lengthFilteredSweetsArray);
	}

	public Sweet[] getSweets() {
		return Arrays.copyOf(sweets, lastIndexAdded);
	}

}
