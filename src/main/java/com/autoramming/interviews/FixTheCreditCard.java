package com.autoramming.interviews;

public class FixTheCreditCard {

    private double balance;
    private final double creditLimit;
    private final double interest;

    public FixTheCreditCard(double creditLimit, double interest) {
        this.creditLimit = creditLimit;
        this.interest = interest;
        this.balance = 0;
    }

    public boolean deposit(double amount) {
        if(amount > creditLimit) {
            return false;
        }
        this.balance += amount;
        return true;
    }

    public double calculateInterest() {
        return (this.interest / 12 / 100) * this.balance;
    }

    public double getBalance() {
        return balance;
    }

}