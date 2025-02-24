package com.assignment4.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.assignment4.model.Employee;

public class EmployeeDAO {

	// method for inserting values to db using prepared statement 	
		public int registerEmployee(Employee employee) throws ClassNotFoundException {

			// create SQL statement
			String INSERT_EMPLOYEE_SQL = "INSERT INTO employee_table (company, payroll, hashed_payroll, fullName, reference, jobTitle, workFunction, workSubFunction, sector, location, hashed_location, building, room, requesterTel, hashed_requesterTel) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			
			int result = 0;
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/app_security_assign4", "root", "123Imperial_123")) {
				
				// prepared statements..
				PreparedStatement ps = connection.prepareStatement(INSERT_EMPLOYEE_SQL);
				
				ps.setString(1, employee.getCompany());
				ps.setInt(2, employee.getPayroll());
				ps.setString(3, employee.getHashedPayroll());
				ps.setString(4, employee.getFullName());
				ps.setString(5, employee.getReference());
				ps.setString(6, employee.getJobTitle());
				ps.setString(7, employee.getWorkFunction());
				ps.setString(8, employee.getWorkSubFunction());
				ps.setString(9, employee.getSector());
				ps.setString(10, employee.getLocation());
				ps.setString(11, employee.getHashedLocation());
				ps.setString(12, employee.getBuilding());
				ps.setString(13, employee.getRoom());
				ps.setInt(14, employee.getRequesterTel());
				ps.setString(15, employee.getHashedRequesterTel());

				System.out.println(ps);
				result = ps.executeUpdate(); // execute SQL statement with all of the user-inputted values
				
			} catch (SQLException e) {
				printSQLException(e);
				
			}
			return result;
		}

		private void printSQLException(SQLException ex) {
			for (Throwable e : ex) {
				if (e instanceof SQLException) {

					e.printStackTrace(System.err);
					System.err.println("SQLState: " + ((SQLException) e).getSQLState());
					System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
					System.err.println("Message: " + e.getMessage());
					Throwable t = ex.getCause();
					while (t != null) {
						System.out.println("Cause: " + t);
						t = t.getCause();

					}
				}

			}

		}
	
}
