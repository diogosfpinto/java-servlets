package br.com.alura.gerenciador.controllers;

import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.web.IWebExchange;

import java.io.Writer;

public interface IGTVGController {

    public void process(final IWebExchange webExchange, final ITemplateEngine templateEngine, final Writer writer) throws Exception;

}
