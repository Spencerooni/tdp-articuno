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
}
