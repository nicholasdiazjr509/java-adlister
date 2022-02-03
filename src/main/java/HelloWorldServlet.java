import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
//       String title = "Hello World";

        String name = req.getParameter("name");
        PrintWriter writer = res.getWriter();
//        writer.println("<h1>" +title+"</h1>");

        if(name == null){
            out.println("Hello World");

        }else{
            out.println("<h1>" + name + "</h1>");
        }

    }
}
