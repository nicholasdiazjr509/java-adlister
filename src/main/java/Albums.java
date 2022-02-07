import java.util.List;

public interface Albums {
    List<Album> all();
    Album findOne(long id);
    void insert(Album album);
    void update(Album album);
    void destroy(Album album);

    void update();
}
