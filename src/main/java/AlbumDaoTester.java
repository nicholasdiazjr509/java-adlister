import java.util.List;

public class AlbumDaoTester {
    public static void main(String[] args) {
        Albums albumsDao = DaoFactory.getAlbumsDao();

        List<Album> albums = albumsDao.all();
            for(Album album : albums){
                System.out.println("One of my ");
            }
    }
}
