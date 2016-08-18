package main;
import employee.Employee;
import employee.Salary;
import employee.Department;
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class testClass {

	public static void main(String[] args) {
		Employee tester= new Employee();
		Salary salary;
		Date current_date = new Date();
		ArrayList<Department> departments = new ArrayList<Department>();
		Department dept_gov= new Department("GOV", "Government Solutions");
		Department dept_evo= new Department("EVOL", "Evolve health-care");
		Department dept_ent= new Department("ENT", "Enterprise");
		departments.add(dept_ent);
		departments.add(dept_gov);
		departments.add(dept_evo);

		SimpleDateFormat date_format= new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(date_format.format(current_date));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter employee number");
		int emp_no = scanner.nextInt();
		tester.setEmp_no(emp_no);
		String input= scanner.nextLine();
		System.out.println("Please enter first name");
		input= scanner.nextLine();
		tester.setF_name(input);
		System.out.println("Please enter last name");
		input= scanner.nextLine();
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
		int starter_salary= scanner.nextInt();		
		salary= new Salary(tester.getEmp_no(), starter_salary, current_date);
		tester.setSalary(salary);
		scanner.nextLine();
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

	}

}
