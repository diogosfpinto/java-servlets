package br.com.alura.gerenciador.controllers;

import br.com.alura.gerenciador.model.Person;
import br.com.alura.gerenciador.services.PersonService;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.IWebExchange;

import java.io.Writer;
import java.util.List;

public class PersonListController implements IGTVGController {
    @Override
    public void process(IWebExchange webExchange, ITemplateEngine templateEngine, Writer writer) throws Exception {
        PersonService service = new PersonService();

        List<Person> persons = service.getAll();

        final WebContext ctx =new WebContext(webExchange, webExchange.getLocale());
        ctx.setVariable("people", persons);
        templateEngine.process("persons", ctx, writer);
    }
}
