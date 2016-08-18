package employee;

public class Department {
	private String dept_no, title;
	


	public Department(String dept_no, String title){
		this.dept_no=dept_no;
		this.title=title;
	}
	public String getDept_no() {
		return dept_no;
	}

	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
