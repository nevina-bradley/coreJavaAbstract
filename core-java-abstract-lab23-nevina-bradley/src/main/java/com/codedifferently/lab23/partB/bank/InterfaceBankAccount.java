package com.codedifferently.lab23.partB.bank;

public interface InterfaceBankAccount {
    String BANK= "JavaBank";
    void deposit(int amt);
    void withdraw(int amt);
    int getBalance();
    String getBankName();
}
