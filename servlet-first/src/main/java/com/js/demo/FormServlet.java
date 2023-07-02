package com.js.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name= req.getParameter("name");
		String email=req.getParameter("email");
		
		PrintWriter pw=res.getWriter();
		pw.write("<html><body><h1>WELCOME "+name+" <br><br>"
				+ " <h1>Your Email is "+email+""
				+ "</h1> </h1></body></html>");
		
	}
	
	

}
