package com.example.tranducvu_21013481_tuan03;

import entities.Qualification;
import entities.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RegistrationFormServlet", urlPatterns = "/registration-form")
public class RegistrationFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Với GET, mã hoá UTF-8 phụ thuộc server; nếu có thể hãy bật URIEncoding="UTF-8" trên Tomcat Connector.
        request.setCharacterEncoding("UTF-8");

        Student s = new Student();
        s.setFirstName(request.getParameter("txtFName"));
        s.setLastName(request.getParameter("txtLName"));
        s.setEmail(request.getParameter("txtEmail"));
        s.setMobile(request.getParameter("txtMobileNumber"));
        s.setGender(request.getParameter("rdGender"));
        s.setAddress(request.getParameter("txtAddress"));
        s.setCity(request.getParameter("txtCity"));
        s.setPinCode(request.getParameter("txtPin"));
        s.setState(request.getParameter("txtState"));
        s.setCountry(request.getParameter("txtCountry"));
        s.setCourse(request.getParameter("cmbCourse"));
        s.setHobbiesArray(request.getParameterValues("chkHobbies"));

        try {
            int d = Integer.parseInt(request.getParameter("cmbDay"));
            int m = Integer.parseInt(request.getParameter("cmbMonth"));
            int y = Integer.parseInt(request.getParameter("cmbYear"));
            s.setBirthday(LocalDate.of(y, m, d));
        } catch (Exception ignore) {}

        List<Qualification> qs = new ArrayList<>();
        qs.add(new Qualification("Class X",
                request.getParameter("boardX"),
                request.getParameter("percentageX"),
                request.getParameter("yopX")));
        qs.add(new Qualification("Class XII",
                request.getParameter("boardXII"),
                request.getParameter("percentageXII"),
                request.getParameter("yopXII")));
        qs.add(new Qualification("Graduation",
                request.getParameter("boardGrad"),
                request.getParameter("percentageGrad"),
                request.getParameter("yopGrad")));
        qs.add(new Qualification("Masters",
                request.getParameter("boardMasters"),
                request.getParameter("percentageMasters"),
                request.getParameter("yopMasters")));
        s.setQualifications(qs);

        request.setAttribute("student", s);
        request.getRequestDispatcher("/result-form.jsp").forward(request, response);
    }
}
