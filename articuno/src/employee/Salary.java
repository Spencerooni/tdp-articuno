package employee;
import java.util.Date;


public class Salary {
	private int emp_num;
	
	private int salary;
	private Date start_date;
	private Date end_date;
	
	public Salary(int emp_num, int salary, Date start_date){
		this.emp_num=emp_num;
		this.salary=salary;
		this.start_date=start_date;
		this.end_date=null;
	}
	
	public Salary(int emp_num, int salary, Date start_date, Date end_date){
		this.emp_num=emp_num;
		this.salary=salary;
		this.start_date=start_date;
		this.end_date=null;
	}
	public void setDate(String date){
		setDate(date);
	}
	public int getSalary(){
		return salary;
	}
	public int getEmp_num() {
		return emp_num;
	}

	public void setEmp_num(int emp_num) {
		this.emp_num = emp_num;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public void setSalary(int salary) {
		this.salary = salary;
				}
}
