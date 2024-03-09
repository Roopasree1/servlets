package getpostpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/mylogin")
public class GPmethod extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myemail = (String) request.getParameter("email1");
		String mypass = (String) request.getParameter("pass1");
		
		if(myemail.equals("roopa@gmail.com")&& mypass.equals("roopa27"))
				{
			     System.out.println("success");
				}
		else
		{
			System.out.println("failed");
		}
	
	}
}
