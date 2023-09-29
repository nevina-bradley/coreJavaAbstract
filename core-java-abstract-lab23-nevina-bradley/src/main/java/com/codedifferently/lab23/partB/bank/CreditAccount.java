package com.codedifferently.lab23.partB.bank;

public class CreditAccount extends Account{

    private int creditLimit;

    public CreditAccount() {
        super();
        this.creditLimit=100;
    }
    //overloaded constructor for CreditAccount
    public CreditAccount(String name, int num,int amt,int credit) {
        super(name,num,amt);
        this.creditLimit=credit;
    }

    public void setCreditLimit(int num) {
        creditLimit = num;
    }

    public int getCreditLimit ( ) {
        return creditLimit;
    }

    public String toString() {
        return accountName + " " + accountNum + " " + balance + " " + creditLimit;
    }
}
