package org.example.tranducvu_21013481_tuan04.controllers;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.tranducvu_21013481_tuan04.daos.ProductDao;
import org.example.tranducvu_21013481_tuan04.daos.impl.ProductDaoImpl;

import javax.sql.DataSource;
import java.io.IOException;

@WebServlet(name = "productController", urlPatterns = "/products")
public class ProductController extends HttpServlet {
    @Resource(name = "jdbc/shopping")
    private DataSource dataSource;
    private ProductDao productDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.productDao = new ProductDaoImpl(this.dataSource);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", productDao.findAll());
        req.getRequestDispatcher("views/product/index.jsp").forward(req, resp);
    }
}
