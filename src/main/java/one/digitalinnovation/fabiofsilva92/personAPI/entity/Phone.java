package one.digitalinnovation.fabiofsilva92.personAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.fabiofsilva92.personAPI.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera valor incremental
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) //Obrigatório
    private PhoneType type;

    @Column(nullable = false)
    private String number;

}
