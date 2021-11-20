package com.example;

public interface AtmProcessService {

    public void checkBalance(Integer accountNumber);

    public void withdrawMoney();

    public void transferAmount();

    public void miniStatement();

    boolean validateUser(int accountNumber, int pinNumber);
}
