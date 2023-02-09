import java.util.Scanner;

public class ShapeDemo1 {

	
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		double radius = scan.nextDouble();
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius, null);
		System.out.println(circle);
		System.out.println("Circle[area="+circle.getArea()+"]\n");
		
		Cylinder cylinder = new Cylinder (radius,height);
		
		System.out.println(cylinder);
		System.out.println(cylinder.getArea());
		System.out.println(cylinder.getVolume());
	}

}
//System.out.println();