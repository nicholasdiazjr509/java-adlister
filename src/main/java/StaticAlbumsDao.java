import java.util.ArrayList;
import java.util.List;

public class StaticAlbumsDao implements Albums{
    private List<Album> albums = new ArrayList<>();
    StaticAlbumsDao(){
        insert(new Album(1, "BTS", "Be", 2020, 2.69f, "K-pop"));
        insert(new Album(2, "Natasha Bedingfield", "Unwritten", 2004, 3.5f, "Pop"));
        insert(new Album(3, "All-4-One", "All-4-One", 1994, 4.55f, "R&B, pop"));

    }
    @Override
    public List<Album> all() {
        return this.albums;
    }

    @Override
    public Album findOne(long id) {
        for(Album album : this.albums) {
            if (album.getId() == id) {
                return album;
            }
        }
        return new Album(99999, "N/A", "Album not found", 9999, 0, "N/A");
    }

    @Override
    public void insert(Album album) {
        this.albums.add(album);
    }

    @Override
    public void update(Album album) {
        Album previousVersion = findOne(album.getId());
        int index = this.albums.indexOf(previousVersion);
        this.albums.set(index, album);
    }

    @Override
    public void destroy(Album album) {
        this.albums.remove(album);
    }
}