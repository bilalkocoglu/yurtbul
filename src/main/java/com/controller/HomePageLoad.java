package com.controller;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LoadServlet" , urlPatterns = "/load")
public class HomePageLoad extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //session.setAttribute("login", "bilalkocoglu");


        ServletContext servletContext = getServletContext();
        //servletContext.setAttribute("resultMesaage" , "true");
        //servletContext.setAttribute("username" , "Yazilim Muhendisligi");
    }
}
