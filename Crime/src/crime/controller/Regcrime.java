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
 * Servlet implementation class Regcrime
 */
@WebServlet("/Regcrime")
public class Regcrime extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int n=1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Regcrime() {
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
		
		int com_id=Integer.parseInt(request.getParameter("com_id"));
		String com_type=request.getParameter("com_type");
		String date=request.getParameter("date");
		
		String victim_det=request.getParameter("victim_det");
		String location=request.getParameter("location");
		String det_com=request.getParameter("det_com");
		
	
			Complaintmodel c1=new Complaintmodel(com_id, com_type, date, victim_det, location, det_com);
			c1.setCom_id(n);
			n++;
			if(RegcrimeDAO.registercrime(c1)==true)
			{
			rd=request.getRequestDispatcher("/jsp/userhome.jsp");
			rd.forward(request, response);
			}
		else
			{
				request.setAttribute("errormsg", "NOT ABLE TO REGISTER YOUR COMPLAINT");
				rd=request.getRequestDispatcher("/jsp/reg_crime.jsp");
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
