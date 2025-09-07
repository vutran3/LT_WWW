package controllers;

import dao.UserDAO;
import dao.impl.InMemoryUserDAO;
import entities.User;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "register01", urlPatterns = {"/register/bai02"})
public class RegisterServlet extends HttpServlet {
    private UserDAO userDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext ctx = config.getServletContext();
        Object dao = ctx.getAttribute("USER_DAO");
        if (dao instanceof UserDAO) {
            userDAO = (UserDAO) dao;
        } else {
            userDAO = new InMemoryUserDAO();
            ctx.setAttribute("USER_DAO", userDAO);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String view = req.getParameter("view");
        if ("list".equals(view)) {
            req.setAttribute("users", userDAO.findAll());
            req.getRequestDispatcher("/WEB-INF/views/users.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String firstName = req.getParameter("firstName");
        String lastName  = req.getParameter("lastName");
        String email     = req.getParameter("email");
        String email2    = req.getParameter("email2");
        String password  = req.getParameter("password");
        String birthday  = req.getParameter("birthday");
        String gender    = req.getParameter("gender");

        // validate cơ bản
        String error = null;
        if (firstName == null || firstName.isBlank() ||
                lastName == null || lastName.isBlank() ||
                email == null || email.isBlank() ||
                email2 == null || !email2.equals(email) ||
                password == null || password.isBlank() ||
                birthday == null || birthday.isBlank() ||
                gender == null) {
            error = "Vui lòng nhập đầy đủ và email khớp nhau.";
        }

        if (error != null) {
            req.setAttribute("error", error);
            req.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(req, resp);
            return;
        }

        LocalDate dob = LocalDate.parse(birthday);
        User user = new User(firstName, lastName, email, dob, gender);
        userDAO.add(user);

        req.setAttribute("users", userDAO.findAll());
        req.setAttribute("message", "Đăng ký thành công!");
        req.getRequestDispatcher("/WEB-INF/views/users.jsp").forward(req, resp);
    }
}
