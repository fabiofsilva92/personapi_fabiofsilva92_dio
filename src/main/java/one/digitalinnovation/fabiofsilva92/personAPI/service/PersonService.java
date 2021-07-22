package one.digitalinnovation.fabiofsilva92.personAPI.service;

import one.digitalinnovation.fabiofsilva92.personAPI.dto.request.PersonDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.dto.response.MessageResponseDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.entity.Person;
import one.digitalinnovation.fabiofsilva92.personAPI.dto.mapper.PersonMapper;
import one.digitalinnovation.fabiofsilva92.personAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);

        return MessageResponseDTO
                .builder()
                .message("Created person with ID "+savedPerson.getId())
                .build();
    }
}
