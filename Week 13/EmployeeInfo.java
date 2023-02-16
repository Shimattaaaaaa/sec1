import java.util.*;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		String choice;

		System.out.print("Insert or Read data : ");
		choice = console.next().toLowerCase();
		while (!choice.equals("insert") && !choice.equals("read")) {
			System.out.print("Please insert or Read data, again : ");
			choice = console.next().toLowerCase();
		}

		// class ton bab desu.
		SaveandOpen file = new SaveandOpen();
		if (choice.equals("insert")) {
			file.insert();
		} else {
			System.out.print("\nEnter Department : ");
			choice = console.next();
			file.setDept(choice);
			file.read();
		}
	}

}