import java.io.*;
import java.util.Scanner;

public class Example1201 {
	static void main(String[] args) throws IOException{
		
		Scanner read = new Scanner(new File ("MemberLogin.txt"));
		while(read.hasNext()) {
			String fname = read.next(); //read data1 from file to fname
			String lname = read.next(); //read data2 from file to lname
			read.next(); //read data from file to password
			String email = read.next().toUpperCase(); //read data 4 from file to email
			System.out.println(fname + "(" + email + ")");
		}
		read.close();
		
	}
}
