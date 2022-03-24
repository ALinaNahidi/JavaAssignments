package com.assignment8;

public class Account {
    private float balance=0;
    public  void deposit(float amount) throws IllegalArgumentException{
        if (amount<=0)
            throw new IllegalArgumentException();
        balance+=amount;
    }

    public void withdraw(float amount) throws InsufficientFundsException{
        if (amount>balance)
            throw new InsufficientFundsException();
        balance-=amount;
    }
}
