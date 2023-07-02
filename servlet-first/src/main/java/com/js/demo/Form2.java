//Install Server in System
//Add Server in Eclipse
//Add remote Catalog
//Create Maven Webapp project
	//-add servlet-api dependecy im pom.xml file
	//-project name--> right click-->properties-->javab-build-path-->order & export-->select all-->apply
	//-Project name--> right click-->maven-->update project-->force update-->ok
							



package com.js.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Form2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String pincode=req.getParameter("pincode");
		
		PrintWriter pw=res.getWriter();
		pw.write("<html><body><h3>WELCOME "+name+"</h3><br>"
				+ "<h5>Your Email is "+email+"</h5><br>"
				+ "<h5>Your City is "+city+"</h5><br>"
				+ "<h5>Your State is "+state+"</h5><br>"
				+ "<h5>Pincode is "+pincode+"</h5></body></html>");
		
	}
	
	

}
