package com.assignment4.servlet;

import java.io.IOException;

import com.assignment4.dao.Md5Hashing;
import com.assignment4.dao.EmployeeDAO;
import com.assignment4.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private EmployeeDAO emDao;

	public void init() {
		emDao = new EmployeeDAO();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		Md5Hashing m1 = new Md5Hashing();
	    
	    // retrieve form data
	    String company = request.getParameter("company");
	    int payroll = Integer.parseInt(request.getParameter("payroll"));
	    String fullName = request.getParameter("fullName");
	    String reference = request.getParameter("reference");
	    String jobTitle = request.getParameter("jobTitle");
	    String workFunction = request.getParameter("workFunction");
	    String workSubFunction = request.getParameter("workSubFunction");
	    String sector = request.getParameter("sector");
	    String location = request.getParameter("location");
	    String building = request.getParameter("building");
	    String room = request.getParameter("room");
	    int requesterTel = Integer.parseInt(request.getParameter("requesterTel"));

	    String hashPayroll = m1.getMd5Int(payroll);
	    String hashRequesterTel = m1.getMd5Int(requesterTel);
	    String hashLocation = m1.getMd5(location);

	    Employee employee = new Employee(
	        company, 
	        payroll, 
	        hashPayroll, 
	        fullName, 
	        reference, 
	        jobTitle,
	        workFunction, 
	        workSubFunction, 
	        sector, 
	        location, 
	        hashLocation, 
	        building, 
	        room, 
	        requesterTel, 
	        hashRequesterTel
	    );

	    try {
	    	// add employee to db
	        emDao.registerEmployee(employee);
	        // encryption and comparison
	        m1.decrypt(hashPayroll);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    response.sendRedirect("Success.jsp");
	}


}