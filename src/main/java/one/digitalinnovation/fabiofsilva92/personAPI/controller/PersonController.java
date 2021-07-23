package one.digitalinnovation.fabiofsilva92.personAPI.controller;

import one.digitalinnovation.fabiofsilva92.personAPI.dto.request.PersonDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.dto.response.MessageResponseDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.entity.Person;
import one.digitalinnovation.fabiofsilva92.personAPI.exception.PersonNotFoundException;
import one.digitalinnovation.fabiofsilva92.personAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {


    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {

        this.personService = personService;
    }

    @PostMapping //Criar Pessoa
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){

        return personService.createPerson(personDTO);

    }

    @GetMapping //Lista de pessoas
    public List<PersonDTO> listAll(){
        return personService.listAll();
    }

    @GetMapping("/{id}") //Pegar pessoa por ID
    public PersonDTO findByID(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {

        return personService.updateById(id, personDTO);

    }

}
