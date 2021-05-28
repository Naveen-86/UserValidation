package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void givenLastName_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateLastName("Labz");
        Assertions.assertEquals(true,status);
    }
}
