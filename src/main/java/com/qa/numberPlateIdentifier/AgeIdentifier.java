package com.qa.numberPlateIdentifier;

public class AgeIdentifier {
    private int ageIdentifier;

    public AgeIdentifier(int ageIdentifier) {
        this.ageIdentifier = ageIdentifier;
    }

    public int getAgeIdentifier() throws AgeIdentifierIncorrectFormatException {
        String temp = Integer.toString(ageIdentifier);
        if (!(temp.length() == 2) || ageIdentifier < 0) {
            throw new AgeIdentifierIncorrectFormatException("Age identifier must be exactly two digits");
        }
        return ageIdentifier;
    }
}
