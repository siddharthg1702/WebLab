import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
 
public class SessionTrack extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
         
      HttpSession session = request.getSession(true);
         
      Date createTime = new Date(session.getCreationTime());
         
      Date lastAccessTime = new Date(session.getLastAccessedTime());

      String title = "Welcome Back";

      if (session.isNew()) {
         title = "Welcome to my website";
         session.setAttribute("userID", "ABCD");
      }
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();

      out.println("<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
            "</body>"+
         "</html>"
      );
   }
}