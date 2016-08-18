package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import employee.Employee;

public class EmployeeDB {

	public static boolean setEmployees(Employee emp) {
		//get all elements from employee to be added
		int emp_no = emp.getEmp_no();
		String f_name = wrapInSingleQuotes(emp.getF_name());
		String l_name = wrapInSingleQuotes(emp.getL_name());
		String address = wrapInSingleQuotes(emp.getAddress());
		String ni_no = wrapInSingleQuotes(emp.getNi_no());
		String dept_no = wrapInSingleQuotes(emp.getMy_dept().getDept_no());
		String title = wrapInSingleQuotes(emp.getMy_dept().getTitle());
		int salary = emp.getMy_salary().getSalary();
		String start_date = wrapInSingleQuotes(emp.getMy_salary().getStart_date());
		String end_date = wrapInSingleQuotes(emp.getMy_salary().getEnd_date());
		String iban = wrapInSingleQuotes(emp.getIBAN());
		String bic = wrapInSingleQuotes(emp.getBIC());
		
		String db = "jdbc:mysql://localhost/articunoEmployees";
		//temporary test files
		String sql_dept = "INSERT INTO department VALUES (" + dept_no + ", "+ title+")";
		String sql_emp = "INSERT INTO employee VALUES (" +emp_no +", "+dept_no +","+f_name+","+l_name+","+address+","+ni_no+","+iban+","+bic+")";
		String sql_sal = "INSERT INTO salary VALUES (" +emp_no+","+ start_date+"," +salary+","+end_date+")";
		try {
			Class driver = Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection(db, "root", "password");
			
			PreparedStatement st1 = c.prepareStatement(sql_dept);
			st1.executeUpdate();
			
			PreparedStatement st2 = c.prepareStatement(sql_emp);
			st2.executeUpdate();
			
			PreparedStatement st3 = c.prepareStatement(sql_sal);
			st3.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	private static String wrapInSingleQuotes(String value) {
		if (value != null)
			return "'" + value + "'";
		else 
			return "null";
	}

}
