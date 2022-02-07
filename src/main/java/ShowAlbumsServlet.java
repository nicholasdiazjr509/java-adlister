import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowAllAlbumsServlet", urlPatterns = ("/albums"))
public class ShowAlbumsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException{
        Albums albumsDao = DaoFactory.getAlbumsDao();
    }
}
