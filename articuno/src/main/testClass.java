package main;
import employee.Employee;
import employee.EmployeeDB;

public class testClass {

	public static void main(String[] args) {
		Employee tester= new Employee();
		tester.setF_name("Bob");
		System.out.println(tester.getF_name());
	
		System.out.println(EmployeeDB.setEmployees());
	}

}
