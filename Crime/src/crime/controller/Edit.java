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
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd;
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter(); 
		Registermodel obj1=new Registermodel();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String adds=request.getParameter("adds");
		String ph_no=request.getParameter("ph_no");
		String pass=request.getParameter("pass");
		Registermodel r2=new  Registermodel(name, email, adds, ph_no, pass);
		 if(EditDAO.edit(r2)==true)
		    {
		    	rd=request.getRequestDispatcher("/jsp/login.jsp");
		    	rd.forward(request, response);
		    }
		    else
		    {
		    	request.setAttribute("errormsg","NOT ABLE TO UPDATE THE PROFILE");
		    	rd=request.getRequestDispatcher("/jsp/edit.jsp");
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
