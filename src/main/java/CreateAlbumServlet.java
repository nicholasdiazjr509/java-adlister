import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/albums/create")
public class CreateAlbumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException{
        request.getRequestDispatcher("/albums/creat.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException{
        Albums albumsDao = DaoFactory.getAlbumsDao();
        String name = request.getParameter("name");
        String artist = request.getParameter("artist");
        int releaseDate = Integer.parseInt(request.getParameter("releaseDate"));
        float sales = Float.parseFloat(request.getParameter("sales"));
        String genre = request.getParameter("genre");
        long id = 1;
        for(Album album : albumsDao()){
            if(album.getId() > id){
                id = album.getId() + 1;
            }

    }
    Album newRecord = new Album(id, artist, name, releaseDate, sales, genre);
        albumsDao.insert(newRecord);

    }
