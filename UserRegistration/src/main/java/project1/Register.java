package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out = response.getWriter();
	  @SuppressWarnings("unused")
	String myname = request.getParameter("name1");
	  @SuppressWarnings("unused")
	String myemail = request.getParameter("email1");
	  @SuppressWarnings("unused")
	String mypass = request.getParameter("pass1");
	  @SuppressWarnings("unused")
	String myphone = request.getParameter("phone1");
	  @SuppressWarnings("unused")
	String mygender = request.getParameter("gender1");
	  @SuppressWarnings("unused")
	String mycity = request.getParameter("city1");
	  
	  try
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_data","root", "R2746@ree*");
		  
		  @SuppressWarnings("unused")
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?)");
		ps.setString(1,myname);
		ps.setString(2, myemail);
		ps.setString(3, mypass);
		ps.setString(4, myphone);
		ps.setString(5, mygender);
		ps.setString(6, mycity);
		
		int count = ps.executeUpdate();
		if(count>0)
		{
			response.setContentType("text/html");
			out.print("<h3 style='color:green'> User registered successfully </h3>");
			
			RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
			rd.include(request,response);
		}
		else
		{
			response.setContentType("text/html");
			out.println("<h3> style='color:red'> User not registered due to error </h3>");
			
			RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
			rd.include(request,response);
		}
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
		  
		  response.setContentType("text/html");
			out.println("<h3> Exception Occured : "+e.getMessage()+" </h3>");
			
			RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
			rd.include(request,response);
	  }
	  
	}

}
