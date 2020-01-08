package com.qa.numberPlateIdentifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberPlateIdentifierTest {
    @Test
    public void age_identifier_throws_exception_if_number_greater_than_100() {
        //arrange
        int ageIdentifier = 359;
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);

        //assert
        assertThrows(AgeIdentifierIncorrectFormatException.class, () -> cut.getAgeIdentifier());
    }

    @Test
    public void age_identifier_throws_exception_if_number_contains_more_than_2_digits() {
        //arrange
        int ageIdentifier = 004;
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);

        //assert
        assertThrows(AgeIdentifierIncorrectFormatException.class, () -> cut.getAgeIdentifier());
    }
}
