package com.example.tranducvu_21013481_tuan01;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet",
        initParams = {
            @WebInitParam(name = "email", value = "admin@gmail.com")
        }
)
public class HelloServlet extends HttpServlet {
    private String message;
    private String email;

    public void init() {
        message = "Hello World!";
        email = getServletConfig().getInitParameter("email");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String appName = getServletContext().getInitParameter("appName");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Application: " + appName + "</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<h3>Hello, " + username + "!</h3>");
    }

    public void destroy() {
    }
}