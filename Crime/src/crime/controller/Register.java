package crime.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import crime.dao.*;
import crime.model.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int n=1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String utype="user";
		response.setContentType("text/html");
		PrintWriter out= response.getWriter(); 
		Registermodel obj1=new Registermodel();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String adds=request.getParameter("adds");
		String ph_no=request.getParameter("ph_no");
		String gender=request.getParameter("gender");
		String sec_qn=request.getParameter("sec_qn");
		String sec_ans=request.getParameter("sec_ans");
	    Registermodel r1=new  Registermodel(name, email, pass, adds, ph_no, gender, sec_qn, sec_ans, utype);
	    if(RegisterDAO.register(r1)==true)
	    {
	    	rd=request.getRequestDispatcher("/jsp/login.jsp");
	    	rd.forward(request, response);
	    }
	    else
	    {
	    	request.setAttribute("errormsg", "PLEASE ENTER THE CREDENTIALS!! NOT ABLE TO REGISTER");
	    	rd=request.getRequestDispatcher("/jsp/registration.jsp");
	    	rd.forward(request, response);
	    }
		
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


