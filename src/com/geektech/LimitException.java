package com.geektech;

public class LimitException extends Exception{
    private String message;
    private double remainingAmount;

    LimitException(String message, double remainingAmount){
        this.message = message;
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public String getMessage() {
        return message;
    }
}
