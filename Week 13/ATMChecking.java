import java.util.*;
import java.io.*;

public class ATMChecking extends ATMData {
	private int money;

	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
	}

	public boolean checkBookBank() throws IOException {
		Scanner read = new Scanner(new File("src/file/ATMBookBank.txt"));
		boolean check = false;
		int money;

		while (read.hasNext()) {
			String accountID = read.next();
			String password = read.next();
			money = read.nextInt();

			if (super.getID().equals(accountID)) {
				if (super.getPass().equals(password)) {
					if (this.money < money) {
						check = true;
					}
				}
			} else {
				check = false;
			}
		}
		return check;
	}

	public void show() throws IOException {
		if (checkBookBank()) {
			System.out.println();
			System.out.println("Your drawing for " + this.money + ", get");
			int thousandBanknote = this.money / 1000;
			int fiveHundredBanknote = (this.money % 1000) / 500;
			int oneHundredBanknote = ((this.money % 1000) % 500) / 100;
			System.out.println("1000 = " + thousandBanknote);
			System.out.println("500 = " + fiveHundredBanknote);
			System.out.println("100 = " + oneHundredBanknote);
			System.out.print("Your balance is " + (money - this.money));
		} else {
			System.err.print("\nSorry, your id or password is wrong, or your amount not enough.");
		}
	}
}