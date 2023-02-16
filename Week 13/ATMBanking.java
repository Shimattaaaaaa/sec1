import java.io.IOException;
import java.util.*;

public class ATMBanking {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter account number :");
		String account = scan.next();
		while (!(account.substring(1,2).equals("-") && account.substring(5,6).equals("-") && account.substring(9,10).equals("-") &&account.substring(12,13).equals("-") && account.length() == 14)) {
			System.out.print("Input wrong type, Enter account number :");
			account = scan.next();
		}
		System.out.print("Enter password : ");
		String password = scan.next();
		while (!(password.length() == 4)) {
			System.out.print("Enter password :");
			password = scan.next();
		}

		System.out.print("Enter money : ");
		int money = scan.nextInt();
		while (!(money % 100 == 0)) {
			System.out.print("Enter money");
			money = scan.nextInt();
		}
		ATMChecking bank = new ATMChecking(account,password,money);
		bank.show();
	}

}