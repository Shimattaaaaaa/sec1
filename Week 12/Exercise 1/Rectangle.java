
public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle (double width,double length,String color) {
		super(color);
		this.width = width ;
		this.length = length;
		
	}
	
	@Override 
	public double getArea() {
		return this.width * this.length;
	}
	
	//return String in form "Rectangle width = [width], length = [length], color = [color]"
	public String toString () {
		return "Rectangle width = " + "[" + getWidth() + "]," + "length = " + "[" + getLength() + "]," + "[" + super.toString()+ "]";
	}
	
	public double getWidth() {
		return this.width ;
	}
	
	public double getLength() {
		return this.length;
	}
}
