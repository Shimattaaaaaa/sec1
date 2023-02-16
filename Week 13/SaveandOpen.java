import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {
	private String name, dept;

	public void insert() throws IOException {
		Scanner console = new Scanner(System.in);
		PrintStream prs = new PrintStream(new File("src/file/employee.txt"));
		String answer;
		do {
			super.Header('*');
			System.out.print("Enter name : ");
			name = console.next();
			System.out.print("Enter Department : ");
			dept = console.next();
			prs.println(name + "\t" + dept);

			// check condition
			System.out.print("Enter data again? : ");
			answer = console.next();
		} while (answer.equalsIgnoreCase("y"));
	}

	public void read() {
		try {
			Scanner in = new Scanner(new File("src/file/employee.txt"));
			int i =0;
			boolean check =false;
			super.Header('*');
			while(in.hasNext()) {
				name = in.next();
				dept=in.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+") "+name);
					check =true;
				}
			}
			if(check) {
				super.Header('*');
				System.out.println("Employee in department " + super.getDept() + " is " + i + " persons." );
				super.Header('*');
			}else {
				System.out.print("\nSorry no department " + super.getDept()+ " in File");
			}
		}catch(IOException e) {
			System.out.print("\nSorry,File not found ... ");
		}
	}
}