package com.aspectj;

public class Account {
    private double balance = 100;

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        balance = balance + value;
    }

    public void withdraw(double value) {
        balance = balance - value;
    }


}
