package fr.mds.jeecourse.helloworldproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		System.out.println("HelloWorldServlet - doGet");
		System.out.println("New parameter is :" + name );
		PrintWriter out = resp.getWriter();
		out.println("Hello " + name);
		
		
		

//		resp.setContentType("text/html");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>My Servlet</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Hello " + name + " !</h1>");
//		out.println("</body>");

		
	}
	
}
