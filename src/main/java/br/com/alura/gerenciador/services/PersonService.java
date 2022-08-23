package br.com.alura.gerenciador.services;

import br.com.alura.gerenciador.model.Person;
import br.com.alura.gerenciador.repositories.PersonRepository;
import br.com.alura.gerenciador.repositories.Repository;

import java.util.List;

public class PersonService {

    private Repository personRepository;

    public PersonService() {
        personRepository = new PersonRepository();
    }

    public List<Person> getAll(){
        return personRepository.getAll();
    }

    public void addNewPerson(Person person){
        personRepository.add(person);
    }
}
