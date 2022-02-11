package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

        public MySQLUsersDao(Config config){
            try {
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );
            }catch (SQLException e){
                throw new RuntimeException("Error connecting to database");
            }
        }
    @Override
    public User findByUsername(String username) {
        String query = "SELECT * FROM users WHERE username = ? LIMIT 1";
        User user = new User();
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            user.setId(rs.getLong("id"));
            user.setUsername("email");
            user.setPassword("password");
            //in case user doesn't exit, something comes back
        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return user;
    }
    @Override
    public Long insert(User user) {
            String insertQuery = "INSERT INTO ads(username, email, description) VALUES (?, ?, ?)";
            long id = 0;
            //create the prepared statement
        try {
            PreparedStatement stmt = connection.prepareStatement(insertQuery,
                    Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();//update, we are using an INSERT
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return id;
    }

    private User extractUser(ResultSet rs) throws SQLException, IOException {
        if (!rs.next()) {
            return null;
        }
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email" ),
                rs.getString("password")
        );
    }
}
