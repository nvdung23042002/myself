package com.example.myself.controller;

import com.example.myself.model.Person;
import com.example.myself.request.PersonRequest;
import com.example.myself.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person/")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("create")
    public ResponseEntity<?> insert(@RequestBody PersonRequest personRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(personService.create(personRequest));
    }
}
