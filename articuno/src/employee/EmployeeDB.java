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
		int salary = emp.getMy_salary().getSalary();
		String start_date = wrapInSingleQuotes(emp.getMy_salary().getStart_date());
		String end_date = wrapInSingleQuotes(emp.getMy_salary().getEnd_date());
		String iban = wrapInSingleQuotes(emp.getIBAN());
		String bic = wrapInSingleQuotes(emp.getBIC());

		String sql_emp = "INSERT INTO employee VALUES (" +emp_no +", "+dept_no +","+f_name+","+l_name+","+address+","+ni_no+","+iban+","+bic+")";
		String sql_sal = "INSERT INTO salary VALUES (" +emp_no+","+ start_date+"," +salary+","+end_date+")";

		try {
			Connection c = getConnected();
			
			if (c == null){
				return false;
			}
			
			PreparedStatement st2 = c.prepareStatement(sql_emp);
			st2.executeUpdate();
			
			PreparedStatement st3 = c.prepareStatement(sql_sal);
			st3.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("Entry of information wrong");
			return false;
		}
		return true;
	}
	
	public static ArrayList<Employee> getEmployeeDB(){
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		Connection c = getConnected();
		
		try{
			//Sql not yet taking salary in
			String sql = "SELECT emp_no, dept_no, f_name, l_name, address, ni_no, iban, bic, dept_name FROM employee JOIN department USING(emp_no)";
			PreparedStatement st = c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			Employee emp;
			while(rs.next()){
				emp = new Employee();
				emp.setEmp_no(rs.getInt("emp_no"));
				emp.set_dept(new Department(rs.getString("dept_no"), rs.getString("dept_name")));
				emp.setF_name(rs.getString("f_name"));
				emp.setL_name(rs.getString("l_name"));
				emp.setAddress(rs.getString("address"));
				emp.setNi_no(rs.getString("ni_no"));
				emp.setIBAN(rs.getString("iban"));
				emp.setBIC(rs.getString("bic"));
				emps.add(emp);
			}
			return emps;
		}catch (Exception e){
			System.out.println("SQL query error");
			return emps;
		}
	}
	
	private static String wrapInSingleQuotes(String value) {
		if (value != null)
			return "'" + value + "'";
		else 
			return "null";
	}
	
	private static Connection getConnected(){
		try{
			String db = "jdbc:mysql://localhost/articunoEmployees";
			Class driver = Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection(db, "root", "password");
			return c;
		}catch (Exception e){
			System.out.println("Error connecting to Driver error");
			return null;
		}
	}

}
