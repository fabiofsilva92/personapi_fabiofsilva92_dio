package one.digitalinnovation.fabiofsilva92.personAPI.dto.mapper;

import one.digitalinnovation.fabiofsilva92.personAPI.dto.request.PersonDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

     PersonDTO toDTO(Person dto);
}
