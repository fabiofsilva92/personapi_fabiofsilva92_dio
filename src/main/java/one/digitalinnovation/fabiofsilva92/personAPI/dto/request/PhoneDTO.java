package one.digitalinnovation.fabiofsilva92.personAPI.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.fabiofsilva92.personAPI.enums.PhoneType;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {


    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;

}
