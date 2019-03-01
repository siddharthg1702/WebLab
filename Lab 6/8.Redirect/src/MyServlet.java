import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String user = request.getParameter("username");
		String regno = request.getParameter("regno");
		String email = request.getParameter("email");

		if (email.contains("@") == false) {
			RequestDispatcher rd = request.getRequestDispatcher("/pg2");
			rd.forward(request, response);
		} else {
			out.println(user + "<br>");
			out.println(regno + "<br>");
			out.println(email + "<br>");

		}
	}
}