package employee;
import java.util.Date;


public class Salary {
	
	private int salary;
	private String start_date, end_date;
	
	public Salary(int salary, String start_date){
		this.salary=salary;
		this.start_date=start_date;
		this.end_date=null;
	}
	
	public Salary( int salary, String start_date, String end_date){
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
	

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public void setSalary(int salary) {
		this.salary = salary;
				}
}
