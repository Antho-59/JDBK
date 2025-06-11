package org.example.exo3.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exo3.model.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "servletPerson", value = "/servlet-person")
public class ServletPerson extends HttpServlet {
    private  List<Person> persons;

    @Override
    public void init() throws ServletException {
        persons = new ArrayList<>();
        persons.add(new Person("John" , "Doe" , 30));
        persons.add(new Person("Jane" , "Doe" , 25));
        persons.add(new Person("Jane" , "Smith" , 20));
        persons.add(new Person("John" , "Smith" , 25));
        persons.add(new Person("John" , "Williams" , 45));
    }

    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {


       req.setAttribute("persons" , persons);
        getServletContext().getRequestDispatcher("/exo3.jsp").forward(req , resp);
    }
}
