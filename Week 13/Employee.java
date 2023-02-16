public class Employee {
	private String dept;

	//method
	public void setDept(String dept) {
		this.dept =dept;
	}

	public String getDept() {
		return this.dept;
	}

	public void Header(char chr) {
		for(int i =1 ; i<=80;i++) {
			System.out.print(chr);
		}
		System.out.println();
	}
}