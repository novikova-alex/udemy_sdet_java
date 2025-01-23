package fundamentals.lsp;

public class Square extends Shape {
    protected int width;

    public Square(int width) {
    	if(width <= 0)
    		throw new  IllegalArgumentException();
    	this.width = width;
    }
    
    public void setWidth(int width) {
    	if(width <= 0)
    		throw new  IllegalArgumentException();
        this.width = width;
    }
    
	@Override
	int calculateArea() {
		return width*width;
	}
    
    
}