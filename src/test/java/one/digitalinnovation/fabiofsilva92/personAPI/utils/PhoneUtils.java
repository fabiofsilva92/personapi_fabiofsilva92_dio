package one.digitalinnovation.fabiofsilva92.personAPI.utils;

import one.digitalinnovation.fabiofsilva92.personAPI.dto.request.PhoneDTO;
import one.digitalinnovation.fabiofsilva92.personAPI.entity.Phone;
import one.digitalinnovation.fabiofsilva92.personAPI.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1195985-9045";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

}
