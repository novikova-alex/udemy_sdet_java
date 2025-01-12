package fundamentals.ocp;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

}
