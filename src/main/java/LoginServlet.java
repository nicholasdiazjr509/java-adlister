
import javax.servlet.http.Cookie;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final String username = "user";
    private final String password = "password";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        if(request.getSession().getAttribute("user") != null){
            response.sendRedirect("/profile");
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
//            if(request.getMethod().equalsIgnoreCase("post")){
                String username = request.getParameter("username");
                String password = request.getParameter("password");

//                User user = DaoFactory.findByUsername(username);

                if(this.username.equals(username) && this.password.equals(password)){
                    HttpSession oldSession = request.getSession(false);
                    if(oldSession != null){
                        oldSession.invalidate();
                    }
                  HttpSession newSession = request.getSession(true);
                    newSession.setMaxInactiveInterval(60);
                    //session expiry 5 minutos

                    Cookie message = new Cookie("message", "Welcome");
                    response.addCookie(message);
                    response.sendRedirect("/profile.jsp");

                }else{
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/login");
                    PrintWriter out = response.getWriter();
                    System.out.println("<font color=red> Either username or password is wrong.</font>");
                    response.sendRedirect("/login");
                }
            }

    }

