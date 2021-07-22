package one.digitalinnovation.fabiofsilva92.personAPI.controller;

import one.digitalinnovation.fabiofsilva92.personAPI.dto.MessageResponseDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.entity.Person;
import one.digitalinnovation.fabiofsilva92.personAPI.repository.PersonRepository;
import one.digitalinnovation.fabiofsilva92.personAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {


    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){

        return personService.createPerson(person);

    }

}
