package com.dream;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
			public void service(HttpServletRequest request, HttpServletResponse response) throws IOException 
			{
				int i = Integer.parseInt( request.getParameter("num1"));
				int j = Integer.parseInt( request.getParameter("num2"));
				int res = i+j;
				System.out.println("The result of two numbers is" + res);
			
				PrintWriter out = response.getWriter();
				
				out.println("<html><body bgcolor='pink'>");
				out.println("The result of two numbers is" + res);
				out.println("</html></body>");
			
			}
}
