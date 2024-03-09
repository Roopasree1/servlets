package ServletReqRes;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Form")
public class sheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myname = request.getParameter("name 1");
		String myemail = request.getParameter("email 1");
		
		System.out.println("Name2: "+myname);
		System.out.println("Email2: "+myemail);
		
		PrintWriter out = response.getWriter();
		out.println("Name : "+myname);
		out.println("Email : "+myemail);
		}
}
