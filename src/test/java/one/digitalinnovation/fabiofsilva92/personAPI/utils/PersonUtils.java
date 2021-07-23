package one.digitalinnovation.fabiofsilva92.personAPI.utils;

import one.digitalinnovation.fabiofsilva92.personAPI.dto.request.PersonDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Fábio";
    private static final String LAST_NAME = "Fábio";
    private static final String CPF_NUMBER = "363.216.008-22";
    private static final Long PERSON_ID = 1L;
    private static final LocalDate BIRTH_DATE = LocalDate.of(2021,10,05);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("05-05-2021")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }

}
