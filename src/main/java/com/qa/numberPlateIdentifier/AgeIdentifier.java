package com.qa.numberPlateIdentifier;

public class AgeIdentifier {
    private int ageIdentifier;

    public AgeIdentifier(int ageIdentifier) {
        this.ageIdentifier = ageIdentifier;
    }

    public int getAgeIdentifier() throws AgeIdentifierIncorrectFormatException {
        if (ageIdentifier >= 100) {
            throw new AgeIdentifierIncorrectFormatException("Age identifier may only contain two digits");
        }
        return ageIdentifier;
    }
}
