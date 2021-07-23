package one.digitalinnovation.fabiofsilva92.personAPI.service;

import one.digitalinnovation.fabiofsilva92.personAPI.dto.request.PersonDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.dto.response.MessageResponseDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.entity.Person;
import one.digitalinnovation.fabiofsilva92.personAPI.repository.PersonRepository;
import one.digitalinnovation.fabiofsilva92.personAPI.utils.PersonUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.any;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

   @Test
   void testGivenPersonDTOThenReturnSendMessage(){
       PersonDTO personDTO = PersonUtils.createFakeDTO();
       Person expectedSavedPerson = PersonUtils.createFakeEntity();

       Mockito.when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

       MessageResponseDTO expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPerson.getId());

       MessageResponseDTO successMessage = personService.createPerson(personDTO);

       Assertions.assertEquals(expectedSuccessMessage, successMessage);
   }

    private MessageResponseDTO createExpectedMessageResponse(Long Id) {
        return MessageResponseDTO.builder()
                .message("Created person with ID " + Id)
                .build();
    }

}
