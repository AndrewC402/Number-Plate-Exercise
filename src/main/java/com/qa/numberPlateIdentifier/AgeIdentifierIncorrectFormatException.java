package com.qa.numberPlateIdentifier;

public class AgeIdentifierIncorrectFormatException extends Exception {
    private String msg;

    public AgeIdentifierIncorrectFormatException(String message) {
        message = msg;
    }

    public String getMsg() {
        return msg;
    }
}
