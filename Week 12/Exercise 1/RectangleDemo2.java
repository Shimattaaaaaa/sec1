import java.util.Scanner;

public class RectangleDemo2 {

	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.print("Input width");
		double width = scan.nextDouble();
		System.out.print("Input length");
		double length = scan.nextDouble();
		System.out.print("Input color");
		String color = scan.nextLine();
		
		Rectangle2 rec = new Rectangle2(width,length);
	}

}
