import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;


public class JDBCTest {
    private static List<String> getEmployerFirstNames() {
        List<String> firstNames = new ArrayList<>();
        try {
//            #1 establish connection
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
    //   #2 Create statement object.
            Statement stmt = connection.createStatement();
    //   #3 Write your query in a String
            String query = "SELECT first_name FROM employees LIMIT 10";
    //  #4 Execute the query
    //.executeQuery(String query) returns a resultSet object. Mainly used for SELECT statements
            // .execute(String query) - returns a boolean confirming whether the query was executed.
            //.execute(String query) - returns the number of rows that were affected.
            ResultSet rs = stmt.executeQuery(query);

//            #5 Handle the ResultSet
            while (rs.next()) {
                firstNames.add(rs.getString("first_name"));
            }
            }catch(SQLException e){
            e.printStackTrace();
            }
            return firstNames;
        }
//not necessary
    public static void main(String[] args) {
        System.out.println(getEmployerFirstNames());
    }
}
