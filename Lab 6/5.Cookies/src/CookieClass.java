import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieClass extends HttpServlet
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie name = null, reg_no = null, email = null;
        Cookie[] cookies = request.getCookies();
        cookies = request.getCookies();

        if(cookies != null)
        {
            for (int i = 0; i < cookies.length; i++)
            {
                if (cookies[i].getName().equals("Name"))
                    name = cookies[i];
                if (cookies[i].getName().equals("Reg_No"))
                    reg_no = cookies[i];
                if (cookies[i].getName().equals("Email"))
                    email = cookies[i];
            }

            if (request.getParameter("name").length() == 0)
                out.println("Name: " + name.getValue()+"<br />");
            else
            {
                out.println("Name: " + request.getParameter("name")+"<br />");
                if (name.getValue().equals("Unknown"))
                {
                    name.setValue(request.getParameter("name"));
                    response.addCookie(name);
                }
            }

            if (request.getParameter("reg_no").length() == 0)
                out.println("Registration Number: " + reg_no.getValue()+"<br />");
            else
            {
                out.println("Registration Number: " + request.getParameter("reg_no")+"<br />");
                if (reg_no.getValue().equals("Unknown"))
                {
                    reg_no.setValue(request.getParameter("reg_no"));
                    response.addCookie(reg_no);
                }
            }
            if (request.getParameter("email").length() == 0)
                out.println("Email: " + email.getValue()+"<br />");
            else
            {
                out.println("Email: " + request.getParameter("email")+"<br />");
                if (email.getValue().equals("Unknown"))
                {
                    email.setValue(request.getParameter("email"));
                    response.addCookie(email);
                }
            }
        }

        else if(cookies == null)
        {
            if (request.getParameter("name").length() == 0)
                name = new Cookie("Name", "Unknown");
            else
                name = new Cookie("name", request.getParameter("name"));

            if (request.getParameter("reg_no").length() == 0)
                reg_no = new Cookie("Reg_No", "Unknown");
            else
                reg_no = new Cookie("Reg_No", request.getParameter("reg_no"));
            
            if (request.getParameter("email").length() == 0)
                email = new Cookie("Email", "Unknown");
            else
                email = new Cookie("email", request.getParameter("email"));

            
            response.addCookie(name);
            response.addCookie(reg_no);
            response.addCookie(email);
        }
    }
}