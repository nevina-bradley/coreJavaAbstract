package com.codedifferently.lab23.partB.bank;

public class Account extends AbstractBankAccount {

    protected String accountName;
    protected int accountNum;
    protected int balance;

    public Account() {
        this.accountName ="EMPTY";
        this.accountNum =0;
        this.balance=0;
    }

    public Account(String accountName, int accountNum, int balance) {
        this.accountName = accountName;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    //make a deposit to the balance
    public void deposit(int amt) {
        balance=balance+amt;
    }
    //make a withdrawal from the balance
    public void withdraw(int amt) {
        balance=balance-amt;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString(){
        return accountName + " " + accountNum + " " + balance;
    }
}
