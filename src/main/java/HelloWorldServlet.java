import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        PrintWriter writer = response.getWriter();
        //out.println("<h1>" + title + "</h1>');
//        response.getWriter().println("<h1>Hello, World!</h1>");
        //BONUS DUDE
        if(name == null) {
            writer.println("Hello World!");
        }else{
            writer.println("<h1>Hello, " + name + "!</h1>");
        }
    }
}