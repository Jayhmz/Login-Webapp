package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DaoLayer.UserDao;
import com.model.Userdetail;


/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	
	UserDao userDao = new UserDao(); //import the dao layer class;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String uname = request.getParameter("username");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		
		//set the request parameters to the model
		Userdetail model = new Userdetail();
		model.setFname(fname);
		model.setLname(lname);
		model.setEmail(email);
		model.setUname(uname);
		model.setPhone(phone);
		model.setPassword(password);
		
		try {
			userDao.Register(model);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
