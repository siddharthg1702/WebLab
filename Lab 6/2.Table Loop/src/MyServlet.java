import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		RequestDispatcher view = request.getRequestDispatcher("html/Table.html");
		view.forward(request, response);
	}
}
