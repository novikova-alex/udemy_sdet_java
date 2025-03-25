package presentsManagement;


public abstract class Sweet {
	
	private String name;
	private double weight;
	private double sugarWeight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return  weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSugarWeight() {
		return sugarWeight;
	}
	public void setSugarWeight(double d) {
		this.sugarWeight = d;
	}
}

