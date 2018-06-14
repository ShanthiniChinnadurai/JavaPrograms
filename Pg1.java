import java.io.*;  
import javax.servlet.*;  
  
public class Pg1 extends GenericServlet{  
public void service(ServletRequest req,ServletResponse res)  
throws IOException{  
  
res.setContentType("text/html");  
  
PrintWriter out=res.getWriter();  
out.print("<html><body>");  
out.print("<b>hello generic servlet</b>");  
out.print("</body></html>");  
  
}  
}  