package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.model.Person;
import br.com.alura.gerenciador.services.PersonService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/persons")
public class PersonController extends HttpServlet {

    public PersonController(){
        System.out.println("Instancia criada");
    }

    private PersonService ps = new PersonService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

//        out.println(ps.getAll().toString());
        RequestDispatcher rd = req.getRequestDispatcher("/views/persons.jsp");
        req.setAttribute("persons", ps.getAll());
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String years = req.getParameter("years");
        String height = req.getParameter("height");

        Person person = new Person(name, Integer.parseInt(years), Double.parseDouble(height));
        ps.addNewPerson(person);

        //chamar o JSP
        RequestDispatcher rd = req.getRequestDispatcher("views/newPersonCreated.jsp");
        req.setAttribute("name", person.getName());
        rd.forward(req, resp);
    }
}
