import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleForm extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Submitted Response";
        String docType =
        "";

        out.println(docType +
            "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
            "<h3 align = \"center\">" + title + "</h1>\n" +
            "<ul>\n" +
            "  <li><b>Name</b>: " + request.getParameter("name") + "\n" +
            "  <li><b>Reg. No</b>: " + request.getParameter("reg_no") + "\n" +
            "  <li><b>Email</b>: " + request.getParameter("email") + "\n" +
            "</ul>\n" +
            "</body>" +
            "</html>"
        );
    }
}