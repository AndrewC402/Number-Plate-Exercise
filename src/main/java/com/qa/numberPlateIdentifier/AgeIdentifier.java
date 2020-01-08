package com.qa.numberPlateIdentifier;

public class AgeIdentifier {
    private String ageIdentifier;

    public AgeIdentifier(String ageIdentifier) {
        this.ageIdentifier = ageIdentifier;
    }

    public String getNextAgeIdentifier(String ageIdentifier) throws AgeIdentifierIncorrectFormatException {
        String nextAgeIdentifier = "";

        if (!(ageIdentifier.length() == 2) || Integer.parseInt(ageIdentifier) < 0) {
            throw new AgeIdentifierIncorrectFormatException("Age identifier must be exactly two digits");

        } else if (Integer.parseInt(ageIdentifier) < 49) {

            int nextAgeIdentifierAsInteger = Integer.parseInt(ageIdentifier) + 50;
            nextAgeIdentifier = String.valueOf(nextAgeIdentifierAsInteger);

        } else if (Integer.parseInt(ageIdentifier) > 50) {

            int nextAgeIdentifierAsInteger = Integer.parseInt(ageIdentifier) - 49;
            nextAgeIdentifier = String.valueOf(nextAgeIdentifierAsInteger);

        }
        return nextAgeIdentifier;
    }

}
