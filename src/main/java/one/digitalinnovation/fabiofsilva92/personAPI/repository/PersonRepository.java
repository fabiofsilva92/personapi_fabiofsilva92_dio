package one.digitalinnovation.fabiofsilva92.personAPI.repository;

import one.digitalinnovation.fabiofsilva92.personAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long>{


}
