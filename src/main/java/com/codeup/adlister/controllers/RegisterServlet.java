package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODONE: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODONE: ensure the submitted information is valid
        // TODONE: create a new user based off of the submitted information
        // TODONE: if a user was successfully created, send them to their profile

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");
        //validation
        boolean inputErrors = username.isEmpty()
                || email.isEmpty() || password.isEmpty() || (!password.equals(passwordConfirmation));
        if (inputErrors) {
            response.sendRedirect("/register");

//        Alternative
//        if(username.isEmpty() || email.isEmpty() || password.isEmpty() || !passwordConfirmation.isEmpty()
//                || DaoFactory.getUsersDao().findByUsername(username).getUsername() != null);
        } else {
            User user = new User(username, email, password);
            request.getSession().setAttribute("user", user.getUsername());
            DaoFactory.getUsersDao().insert(user);
            response.sendRedirect("/profile");
        }
    }
}
