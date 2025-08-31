package com.example.tranducvu_21013481_tuan02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "login", urlPatterns = "login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String user = getServletConfig().getInitParameter("adminUser");
        String pass = getServletConfig().getInitParameter("adminPassword");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username == null || username.isBlank() || password == null || password.isBlank()) {
            req.setAttribute("error", "Please enter username and password.");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }

        if (username.equals(user) && password.equals(pass)) {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        } else {
            req.setAttribute("error", "Invalid credentials.");
            req.getRequestDispatcher("/home.jsp").forward(req, resp);
        }
    }
}
