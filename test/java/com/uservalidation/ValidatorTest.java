package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void givenFirstName_itIsValid_returnTrue() {
        Validator validator = new Validator();
        boolean status = validator.validateFirstName("Bridgelabz");
        Assertions.assertEquals(true,status);
    }
}
