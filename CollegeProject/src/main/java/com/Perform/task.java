package com.Perform;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

 
public class task extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=null;
		try {
			out=response.getWriter();
			int n=Integer.parseInt(request.getParameter("n1"));
			out.println("<center>");
			if(n%2==0)
				out.println(n+" is even number");
			else
				out.println(n+" is odd number");
		    }
		catch(Exception e) {
			out.println("Error:"+e.getMessage());
		}
		finally {
			out.println("<br><br>");
			out.println("To goto main page <a href=index.html>Click HERE </a>");
			out.println("</center>");
		}
	}

}
