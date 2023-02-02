package com.example.myself.service;

import com.example.myself.model.Person;
import com.example.myself.repository.PersonRepository;
import com.example.myself.request.PersonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepo;

    public Person create(PersonRequest personRequest) {
        Person probe = new Person();
        probe.setIdentityCard("123456");
        Example<Person> example = Example.of(probe);
        boolean exists = personRepo.exists(example);
        Person newPerson = Person.builder()
                .name(personRequest.getName())
                .age(personRequest.getAge())
                .build();
        return personRepo.save(newPerson);
    }

}
