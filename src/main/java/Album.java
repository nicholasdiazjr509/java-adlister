import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String name;
    private String genre;
    private int release_date;
    private float certified;
    private float sales;

    //our constructors
    public Album() {
    }

    public Album(long id, String artist, String name, String genre,
                 int release_date, float certified, float sales) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.genre = genre;
        this.release_date = release_date;
        this.certified = certified;
        this.sales = sales;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public float getCertified() {
        return certified;
    }

    public void setCertified(float certified) {
        this.certified = certified;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }
}
//DESIGN the database
