import javax.swing.*;

public class RectangleDemo1 {
	

	public static void main(String[] args) {
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input Width"));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input Width"));
		String color = JOptionPane.showInputDialog("Input Width");
		
		Rectangle rec= new Rectangle(width,length,color);
		
		JOptionPane.showMessageDialog(null , rec + "\nArea of Rectanle is " + rec.getArea());//call toString method() from rectangle
			
		
	}

}
