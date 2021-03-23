package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dao.RegisterDAO;
import com.xworkz.dao.RegisterDAOImpl;
import com.xworkz.dto.RegisterDTO;
import com.xworkz.service.RegisterServiceImpl;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException,NumberFormatException {
		System.out.println("Inside Servlet");

		String firstName = req.getParameter("Fname");
		String lastName = req.getParameter("Lname");
		String emailId = req.getParameter("id");
		String address = req.getParameter("address");
		String userName = req.getParameter("Uname");
		String createPassword = req.getParameter("pass");
		String confirmPassword = req.getParameter("Conpass");

		System.out.println("First name is " + firstName);
		System.out.println("Last name is " + lastName);
		System.out.println("EmailId is " + emailId);
		System.out.println("Address is " + address);
		System.out.println("User name is " + userName);
		System.out.println("Password is " + createPassword);
		System.out.println("Confirmed password is " + confirmPassword);

		RegisterDTO registerDTO = new RegisterDTO(firstName, lastName,emailId, address, userName, createPassword,
				confirmPassword);
		RegisterDAO registerDAO = new RegisterDAOImpl();
		RegisterServiceImpl registerServiceImpl = new RegisterServiceImpl(registerDAO);
		registerServiceImpl.validateAndSave(registerDTO);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Successful.html");
		requestDispatcher.forward(req, resp);

	}
}
