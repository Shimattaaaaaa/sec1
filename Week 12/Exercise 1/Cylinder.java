
public  class Cylinder extends Circle{
	private double height;
	
	
	public Cylinder (double radius,double height) {
		super(radius,null);
		this.height = height;
		
	}
	public double getHeight () {
		return this.height;
	}
	public double getVolume (){
		return getRadius()*this.height;
	}
	public double getArea () {
		return (2*3.14)*(height + getRadius() );
	}
	public String toString () {
		return "height = [" + this.height + "], [" + super.toString()+"]";
	}
}
