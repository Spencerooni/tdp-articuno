package main;
import employee.Employee;

import employee.Salary;
import employee.Department;
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import employee.EmployeeDB;

public class testClass {

	public static void main(String[] args) {
		System.out.println(EmployeeDB.getEmployeeDB().get(1).getEmp_no());
		
		Employee tester= new Employee();

		Salary salary;
	//	Date current_date = new Date();
		ArrayList<Department> departments = new ArrayList<Department>();
		Boolean error=true;
		Department dept_gov= new Department("GOV", "Government Solutions");
		Department dept_evo= new Department("EVOL", "Evolve health-care");
		Department dept_ent= new Department("ENT", "Enterprise");
		departments.add(dept_ent);
		departments.add(dept_gov);
		departments.add(dept_evo);
		
		String emp_no_string= " ";
		String starter_salary_string= " ";
		String input= " ";
		int emp_no=0;
		int starter_salary=0;
		int day=0;
		int month=0;
		int year=0;
		String day_string=" ";
		String month_string=" ";
		String year_string=" ";

//		SimpleDateFormat date_format= new SimpleDateFormat("yyyy/MM/dd");
//		System.out.println(date_format.format(current_date));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter employee number");
//		while(error==true){
//			emp_no_string = scanner.nextLine();
//			if(emp_no_string.matches("[0-9]+")){
//				emp_no=Integer.parseInt(emp_no_string);
//				error=false;
//			}
//			else{
//				System.out.println("Please enter the employee number without any letters");
//			}
//		}
		emp_no=checkIfInt(emp_no,emp_no_string, scanner, "employee number");
		
		tester.setEmp_no(emp_no);
		error=true;
		System.out.println("Please enter first name");
		while(error==true){
			input= scanner.nextLine();
			if(!input.matches(".*\\d+.*")){
				error=false;
			}
			else{
				System.out.println("Please enter a first name without any numbers");
			}
		}
		tester.setF_name(input);
		error=true;
		System.out.println("Please enter last name");
		while(error==true){
			input= scanner.nextLine();
			if(!input.matches((".*\\d+.*"))){
				error=false;
			}
			else{
				System.out.println("Please enter a last name without any numbers");
			}
		}
		error=true;
		tester.setL_name(input);
		System.out.println("Please enter address");
		input= scanner.nextLine();
		tester.setAddress(input);
		System.out.println("Please enter national insurance number");
		input= scanner.nextLine();
		tester.setNi_no(input);
		System.out.println("Please enter IBAN");
		input= scanner.nextLine();
		tester.setIBAN(input);
		System.out.println("Please enter BIC");
		input= scanner.nextLine();
		tester.setBIC(input);
		System.out.println("Please enter your starter salary");
		starter_salary= checkIfInt(starter_salary, starter_salary_string,scanner,
				"salary");
		System.out.println("Please enter the today's day date: DD");
		day= checkIfInt(day, day_string,scanner,"day");
		System.out.println("Please enter the today's month date: MM");
		month= checkIfInt(month, month_string, scanner, "month");
		System.out.println("Please enter the today's year date: YYYY");
		year= checkIfInt(year, year_string, scanner, "year");
		String current_date= String.format("%s-%s-%s", year,month,day);
		salary= new Salary(starter_salary, current_date);
		tester.setSalary(salary);
		System.out.println("Please enter your department");
		input= scanner.nextLine();

		for(int i=0; i<departments.size(); i++){
			if(input.equalsIgnoreCase(departments.get(i).getTitle())){
				tester.set_dept(departments.get(i));
				break;
			}
		}
		
		System.out.println(tester.getMy_dept().getTitle());
		System.out.println(tester.getMy_salary().getSalary());
		scanner.close();
	

		System.out.println(EmployeeDB.setEmployees(tester));

	}
	
	private static int checkIfInt(int number, String number_string, Scanner scanner, String field_name){
		boolean check=true;
		while(check==true){
			number_string = scanner.nextLine();
			if(number_string.matches("[0-9]+")){
				number=Integer.parseInt(number_string);
				return number;
			}
			else{
				System.out.println(String.format(("Please enter the %s without any letters"), field_name));
			}
		}
		return number;
	}

}
