import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
    Album album = new Album(1, "BTS",  "Be","K-pop", 2020, 2.69f, 3 );
    Album unwritten = new Album(2, "Natasha Bedingfield", "Unwritten", 2004, 3.5f, "Pop");
    Author douglas = new Author(1, "Shrek", "An Ogre");
    Quotes quote = new Quotes(1, "Better than in, IO always say.", shrek);

        System.out.println("One of my fav albums is \"%s\" by the music act %s," +
                "which has sold %f million copies", album.getName(), album.getArtist(),
                album.getSales());

        List<Album> collectionsOfAlbums = new ArrayList<>();
        collectionsOfAlbums.add(bts);
        collectionsOfAlbums.add(unwritten);

        for(Album album : collectionsOfAlbums){
            System.out.printf("One of my fav albums is \"%s\" by the music act %s." +
                    "which has sold %.2f million copies.%n", album.getName(), album.getArtist(),
                    album.getSales());
        }
        System.out.printf("The wise philosopher %s %s once said \"%s\"%n",
                quote.getAuthor().getFirstName(), quote.getAuthor().getLastName(), quote.getContent());

    }
//    experiment with storing multiple instances of Quote in an arraylist and iterating
//    over it to print out the content and author name of multiple quotes
}
