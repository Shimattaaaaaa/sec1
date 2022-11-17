import javax.swing.*;
import java.text.*;

public class MusicWorldApp {
	
	public static final double TAX_RATE = .0625;
	public static double cdSubtotal,cdTotal;

	public static void main(String[] args) {
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		DecimalFormat frm = new DecimalFormat("##,####");
		DecimalFormat frm2 = new DecimalFormat("##,#");
		
		String cdid = JOptionPane.showInputDialog(null,
				"This program calculates the total cost of a CD order Please enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog(null,
				"PLease enter the title of cd");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog(null,"PLease enter the price of the CD in U.S. dollars"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog(null,"PLease enter the quantity to be purchased"));
		
		cdSubtotal = cdPrice*cdQuantity;
		cdTotal = (cdPrice*cdQuantity)*(1 + TAX_RATE);
		JOptionPane.showMessageDialog(null,"Summary of the transaction:"
				+ "\n\nCD ID: "+cdid+
				"CD TITLE "+cdTitle+
				"CD PRICE "+cdPrice+
				"CD QUANTITY "+cdQuantity+
				
				"\n\nSubtotal: "+frm2.format(cdSubtotal)+
				"Tax rate: "+frm.format(TAX_RATE*100)+
				"Total: "+frm.format(cdTotal)+
				
				"\n\nEND OF PROGRAM");
		
		
		
		
		
		
	}

}
