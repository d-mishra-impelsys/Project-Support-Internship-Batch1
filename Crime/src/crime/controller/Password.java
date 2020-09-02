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
import crime.model.Registermodel;

/**
 * Servlet implementation class Password
 */
@WebServlet("/Password")
public class Password extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Password() {
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
        String email=request.getParameter("email");
        String sec_qn=request.getParameter("sec_qn");
		String sec_ans=request.getParameter("sec_ans");
	     if(email!=null && sec_ans!=null)
	     {
			Registermodel r3=new  Registermodel();
			r3.setEmail(email);r3.setSec_qn(sec_qn);r3.setSec_ans(sec_ans);
			
		 if(PasswordDAO.forgot(r3)==true)
		    {
		    	rd=request.getRequestDispatcher("/jsp/edit.jsp");
		    	rd.forward(request, response);
		    }
		 else
		    {
		    	request.setAttribute("errormsg","Emaild is invalid o, question or answer not matched");
		    	rd=request.getRequestDispatcher("/jsp/for_pass.jsp");
		    	rd.forward(request, response);
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
