package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "controllers.AdsSearchServlet", urlPatterns = "/ads/search")
public class AdsSearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param = request.getParameter("query");
        List<Ad> results = new ArrayList<>();
        if(param != null){
            results = DaoFactory.getAdsDao().searchAdByTitle(param);
        }
        request.setAttribute("ads", results);
        request.setAttribute("query", param);
        request.getRequestDispatcher("/WEB_INF/ads/search.jsp").forward(request, response);
    }
}
