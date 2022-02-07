import java.io.Serializable;

public class Quotes implements Serializable {
    private String author_first_name;
    private String quotes;

    public Quotes (){

    }

    public Quotes(String author, String quotes) {
        this.author_first_name = author;
        this.quotes = quotes;
    }

    public String getAuthor() {
        return author_first_name;
    }

    public void setAuthor(String author) {
        this.author_first_name = author;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }
}
