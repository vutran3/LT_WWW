package com.example.tranducvu_21013481_tuan03;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "register", urlPatterns = {"/register/*"})
public class HomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String path = req.getPathInfo();

        if ("/bai01".equals(path)) {
            forward("/register.jsp", req, resp);
        } else if ("/bai02".equals(path)) {
            forward("/WEB-INF/views/register.jsp", req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    private void forward(String view, HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher(view).forward(req, resp);
    }
}