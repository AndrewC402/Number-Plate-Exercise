package com.qa.numberPlateIdentifier;

public class AgeIdentifier {
    private String ageIdentifier;

    public AgeIdentifier(String ageIdentifier) {
        this.ageIdentifier = ageIdentifier;
    }

    public String getAgeIdentifier() throws AgeIdentifierIncorrectFormatException {
        int temp = Integer.parseInt(ageIdentifier);
        if (!(ageIdentifier.length() == 2) || temp < 0) {
            throw new AgeIdentifierIncorrectFormatException("Age identifier must be exactly two digits");
        }
        return ageIdentifier;
    }

    public String getNextAgeIdentifier(String ageIdentifier) {
        int nexAgeIdentifierAsInteger = Integer.parseInt(ageIdentifier) + 50;
        String nexAgeIdentifier = String.valueOf(nexAgeIdentifierAsInteger);

        return nexAgeIdentifier;
    }
}
