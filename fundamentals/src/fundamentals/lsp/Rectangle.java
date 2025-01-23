package fundamentals.lsp;

public class Rectangle extends Shape {
	protected int width;
    protected int height;
    
    public Rectangle(int width, int height) {
    	if(width <= 0 || height <= 0)
    		throw new  IllegalArgumentException();
    	this.height = height;
    	this.width = width;
    }

    public void setWidth(int width) {
    	if(width <= 0)
    		throw new  IllegalArgumentException();
        this.width = width;
    }

    public void setHeight(int height) {
    	if(height <= 0)
    		throw new  IllegalArgumentException();
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}