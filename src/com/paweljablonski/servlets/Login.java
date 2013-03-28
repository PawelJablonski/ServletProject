package com.paweljablonski.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paweljablonski.servlets.services.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = (String) request.getParameter("login");
		String pw = (String) request.getParameter("pw");
		
		LoginService loginService = new LoginService(login, pw);
		boolean loggedIn = loginService.checkUser();
		
		PrintWriter out = response.getWriter();		
		
		if(loggedIn)
		{
			out.print("login correct");
		}
		else
		{
			out.print("login incorrect");
		}
	}

}
