package br.com.yanlimaqz.services;

import br.com.yanlimaqz.model.Person;
import br.com.yanlimaqz.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;


    public Person findById(String id) {
        logger.info("Finding one person");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Yan");
        person.setLastName("Lima");
        person.setAddress("Itarema - CE - Brasil");
        person.setGender("Male");
        return person;
    }
    public List<Person> findAll() {
        logger.info("Finding all People!");
        List<Person> persons = new ArrayList<Person>();
        for(int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person create(Person person) {
        logger.info("Finding one Person!");
        return person;
    }

    public Person update(Person person) {
        logger.info("Finding one Person!");
        return person;
    }

    public void delete(String id) {
        logger.info("Deleting one Person!");

    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName " + i);
        person.setLastName("LastName " + i);
        person.setAddress("Some address in Brazil");
        person.setGender("Gender");
        return person;
    }
}