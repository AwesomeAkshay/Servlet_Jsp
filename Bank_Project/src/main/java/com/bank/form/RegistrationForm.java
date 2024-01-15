package com.bank.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationForm extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		String dob = req.getParameter("date");
		String id = req.getParameter("user_id");
		String add = req.getParameter("user_address");
		String gender = req.getParameter("user_gender");
		String acct = req.getParameter("accountType");
		
		PrintWriter pw = res.getWriter();
		//pw.print(dob);
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat(); Date dob1 = null; Date dob2 =
		 * null;
		 */
		
		/*
		 * try { //dob2 = sdf.parse("01-01-2005"); dob1 = sdf.parse(dob);
		 * //pw.print(dob2); pw.print(dob1); } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		/*
		 * int i = dob2.compareTo(dob1); pw.print(i);
		 */
		/*
		 * if(i>0) { RequestDispatcher rd = req.getRequestDispatcher("thank.jsp");
		 * rd.forward(req, res); } else { pw.print("You are not eligible"); }
		 */
		
		if(dob!=null && id!=null && add!=null && gender != null && acct!= null) {
			RequestDispatcher rd = req.getRequestDispatcher("thank.jsp");
		    rd.forward(req, res);
		}
		else { 
			pw.print("Please fill the form");
		}
		
	}

	
		
	}


