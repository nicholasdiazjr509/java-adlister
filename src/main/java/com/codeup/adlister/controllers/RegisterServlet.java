package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Statement;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // TODONE: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        // TODONE: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile

       String username = request.getParameter("username");
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       String passwordConfirmation = request.getParameter("confirm_password");
    //validation
        boolean inputErrors = username.isEmpty()
                || email.isEmpty() || password.isEmpty() || (! password.equals (passwordConfirmation));
        if(inputErrors){
            response.sendRedirect("/register");
        }

        User user = new User(username, email, password);
        request.getSession().setAttribute("user", user);
        DaoFactory.getUsersDao().insert(user);
        response.sendRedirect("/profile");
    }
}
