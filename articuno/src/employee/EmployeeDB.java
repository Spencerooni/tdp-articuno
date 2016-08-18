package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import employee.Employee;

public class EmployeeDB {

	public static boolean setEmployees() {
		ArrayList<Employee>emps = new ArrayList<Employee>();
		String db = "jdbc:mysql://localhost/articunoEmployees";
		//temporary test files
		String sql_dept = "INSERT INTO department VALUES ('TES5', 'TNAME1')";
		String sql_emp = "INSERT INTO employee VALUES (" + "3, 'TEST', 'M', 'H', 'address', 'YT837483H', null, null)";
		String sql_sal = "INSERT INTO salary VALUES (" + "1, '2012-12-12', 1, null)";
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

}
