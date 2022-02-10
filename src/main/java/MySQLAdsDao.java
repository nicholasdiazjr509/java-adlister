import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

    private Connection connection = null;
    //connection instance

    public MySQLAdsDao(Config config) {
        try {
//           Config config = new Config();  ALready defined in scope
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

        } catch (SQLException e) {
          e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> allAds = new ArrayList<>();
//        the bucket
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM ads";

            ResultSet resultSet = statement.executeQuery(query);
       while(resultSet.next()) {
           //to add objects. my resultSet to objects
           Ad newAd = new Ad(

                   resultSet.getLong("id"),
                   resultSet.getLong("user_id"),
                   resultSet.getString("title"),
                   resultSet.getString("description")
           );
           allAds.add(newAd);
       }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allAds;
    }
    @Override
    public Long insert(Ad ad) {
        try {
        Statement statement = connection.createStatement();

        String insertQuery = "INSERT INTO ads(user_id, title, description) VALUES " +
                "(" + ad.getUserId() + ", " + ", " + ad.getTitle() +
                "'," + ad.getDescription() + "')";

           statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
           ResultSet resultSet = statement.getGeneratedKeys();
           resultSet.next();
           return resultSet.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("ERROR @insert a new ad.", e);
        }
    }
}


