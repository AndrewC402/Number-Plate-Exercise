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
        assertThrows(AgeIdentifierIncorrectFormatException.class, () -> cut.getNextAgeIdentifier(ageIdentifier));
    }

    @Test
    public void age_identifier_throws_exception_if_number_contains_more_than_2_digits() throws AgeIdentifierIncorrectFormatException {
        //arrange
        String ageIdentifier = "004";
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);

        //assert
        assertThrows(AgeIdentifierIncorrectFormatException.class, () -> cut.getNextAgeIdentifier(ageIdentifier));
    }

    @Test
    public void age_identifier_throws_exception_if_number_negative() throws AgeIdentifierIncorrectFormatException {
        //arrange
        String ageIdentifier = "-05";
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);

        //assert
        assertThrows(AgeIdentifierIncorrectFormatException.class, () -> cut.getNextAgeIdentifier(ageIdentifier));
    }

    @Test
    public void age_identifier_throws_exception_if_non_numeric_entered() throws AgeIdentifierIncorrectFormatException {
        //arrange
        String ageIdentifier = "f!";
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);

        //assert
        assertThrows(AgeIdentifierIncorrectFormatException.class, () -> cut.getNextAgeIdentifier(ageIdentifier));
    }
    @Test
    public void age_identifier_changes_from_march_to_september() throws AgeIdentifierIncorrectFormatException {
        //arrange
        String ageIdentifier = "02";
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);
        String expectedResult = "52";

        //act
        String actualResult = cut.getNextAgeIdentifier(ageIdentifier);

        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void age_identifier_changes_from_september_to_march() throws AgeIdentifierIncorrectFormatException {
        //arrange
        String ageIdentifier = "59";
        AgeIdentifier cut = new AgeIdentifier(ageIdentifier);
        String expectedResult = "10";

        //act
        String actualResult = cut.getNextAgeIdentifier(ageIdentifier);

        //assert
        assertEquals(expectedResult,actualResult);
    }
}
