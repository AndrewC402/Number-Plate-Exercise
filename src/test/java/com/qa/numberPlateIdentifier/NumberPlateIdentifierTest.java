package com.qa.numberPlateIdentifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberPlateIdentifierTest {
    @Test
    public void age_identifier_throws_exception_if_number_greater_than_100() throws AgeIdentifierIncorrectFormatException {
        //arrange
        String ageIdentifier = "359";
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);

        //assert
        assertThrows(AgeIdentifierIncorrectFormatException.class, () -> cut.getAgeIdentifier());
    }

    @Test
    public void age_identifier_throws_exception_if_number_contains_more_than_2_digits() throws AgeIdentifierIncorrectFormatException {
        //arrange
        String ageIdentifier = "004";
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);

        //assert
        assertThrows(AgeIdentifierIncorrectFormatException.class, () -> cut.getAgeIdentifier());
    }

    @Test
    public void age_identifier_throws_exception_if_number_negative() throws AgeIdentifierIncorrectFormatException {
        //arrange
        String ageIdentifier = "-05";
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);

        //assert
        assertThrows(AgeIdentifierIncorrectFormatException.class, () -> cut.getAgeIdentifier());
    }
    @Test
    public void age_identifier_changes_from_march_to_september_of_same_year() throws AgeIdentifierIncorrectFormatException {
        //arrange
        String ageIdentifier = "02";
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);
        String expectedResult = "52";

        //act
        String actualResult = cut.getNextAgeIdentifier(ageIdentifier);

        //assert
        assertEquals(expectedResult,actualResult);
    }
}
