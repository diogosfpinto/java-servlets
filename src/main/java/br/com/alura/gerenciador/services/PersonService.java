package br.com.alura.gerenciador.services;

import br.com.alura.gerenciador.model.Person;
import br.com.alura.gerenciador.repositories.Repository;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private Repository<Person> personRepository;
    private List<Person> persons= new ArrayList<>();

    public PersonService() {
        createPersons();
        personRepository = new Repository<>(persons);
    }

    private void createPersons(){
        persons.add(new Person("Diogo de Souza", 25, 1.70));
        persons.add(new Person("Emanoel Marcos", 53, 1.89));
        persons.add(new Person("Lindineide Oliveira", 53, 1.59));
    }

    public List<Person> getAll(){
        return persons;
    }
}
