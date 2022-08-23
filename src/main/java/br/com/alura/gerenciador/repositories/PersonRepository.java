package br.com.alura.gerenciador.repositories;

import br.com.alura.gerenciador.model.Person;

import java.util.ArrayList;

public class PersonRepository extends Repository<Person> {

    public PersonRepository() {
        list = new ArrayList<>();
        createPersons();

    }

    private void createPersons(){
        list.add(new Person("Diogo de Souza", 25, 1.70));
        list.add(new Person("Emanoel Marcos", 53, 1.89));
        list.add(new Person("Lindineide Oliveira", 53, 1.59));
    }
}

