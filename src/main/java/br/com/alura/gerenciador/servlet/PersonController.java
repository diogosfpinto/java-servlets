package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.model.Person;
import br.com.alura.gerenciador.services.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/persons")
public class PersonController extends HttpServlet {

    private PersonService ps = new PersonService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println(ps.getAll().toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String years = req.getParameter("years");
        String height = req.getParameter("height");

        Person person = new Person(name, Integer.parseInt(years), Double.parseDouble(height));
        ps.addNewPerson(person);
    }
}
