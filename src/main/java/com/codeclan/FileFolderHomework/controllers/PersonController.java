package com.codeclan.FileFolderHomework.controllers;

import com.codeclan.FileFolderHomework.models.Person;
import com.codeclan.FileFolderHomework.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){
        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> postPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }


}
