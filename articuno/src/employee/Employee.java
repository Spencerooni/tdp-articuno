package employee;

import java.util.Date;

public class Employee {
	private int emp_no;
	private String f_name, l_name, address, ni_no, IBAN, BIC;
	private Department my_dept;
	private Salary my_salary;
	
	
	public void create_salary( int salary, String start_date){
		my_salary= new  Salary(salary, start_date);		
	}
	
	public void setSalary(Salary my_salary){
		this.my_salary=my_salary;
	}
	
	public void set_dept(Department my_dept){
		this.my_dept=my_dept;
		
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNi_no() {
		return ni_no;
	}
	public void setNi_no(String ni_no) {
		this.ni_no = ni_no;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public String getBIC() {
		return BIC;
	}
	public void setBIC(String bIC) {
		BIC = bIC;
	}
	public Department getMy_dept() {
		return my_dept;
	}
	public void setMy_dept(Department my_dept) {
		this.my_dept = my_dept;
	}
	public Salary getMy_salary() {
		return my_salary;
	}
	public void setMy_salary(Salary my_salary) {
		this.my_salary = my_salary;
	}
	
	
	
	
}
