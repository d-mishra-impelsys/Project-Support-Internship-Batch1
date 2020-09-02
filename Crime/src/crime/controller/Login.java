package crime.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


import crime.dao.*;
import crime.model.*;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out= response.getWriter(); 
		Registermodel obj=new Registermodel();
		String email=request.getParameter("email");  
		String pass=request.getParameter("pass");
	    Registermodel rm1=new  Registermodel();
	    rm1.setEmail(email);rm1.setPass(pass);

		if(email!=null && pass!=null)
		{
			String utype=LoginDAO.login(rm1);
			if(utype.equals("admin"))
			{  
		        RequestDispatcher rd=request.getRequestDispatcher("/jsp/adminhome.jsp");  
		        rd.include(request,response);  
		    }  
			else if (utype.equals("user"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/userhome.jsp");  
		        rd.include(request,response);  
			}
			else
			{
				request.setAttribute("errormsg", "invalid userid and password");
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/login.jsp");  
		        rd.include(request,response);
			}
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
