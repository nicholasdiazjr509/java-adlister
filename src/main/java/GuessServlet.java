import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")

public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/guessing-game.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
     System.out.println(request.getParameter("guess"));
        int userNum = Integer.parseInt(request.getParameter("guess"));
        int answer = (int)Math.floor((Math.random() * 3)+1);
        //cast to an (int)
        if(userNum == answer) {
            response.sendRedirect("/correct");
        }else{
            response.sendRedirect("/incorrect");
            //remember, more servlets
        }
}
}