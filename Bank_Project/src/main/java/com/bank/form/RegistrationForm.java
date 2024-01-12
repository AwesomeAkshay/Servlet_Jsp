package com.bank.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationForm extends HttpServlet{
	
	public void dopost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("firstname");
		PrintWriter pw = res.getWriter();
		pw.print(name);
		
		
		
	}

	
		
	}


