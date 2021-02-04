package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.validator.LoginValidator;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		LoginValidator validate = new LoginValidator(uname, pass);
		
		if(validate.validate())
		{
			HttpSession	session = request.getSession();
			session.setAttribute("username", uname);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("error", validate.getError());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		
		
		
	}

}
