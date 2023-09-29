package com.codedifferently.lab23.partB.bank;

abstract public class AbstractBankAccount {
    //Instance Fields
    public final String BANK= "JavaBank";
    protected String accountName;
    protected int accountNum;
    protected int balance;
    abstract public void deposit(int amt);
    abstract public void withdraw(int amt);
    abstract public int getBalance();
    abstract public String getBankName();
    public String getAccountName(){
        return null;
    }
    public void setAccountName(String name){}
    public int getAccountNum(){
        return 0;
    }
    public void setAccountNum(int num){/*code*/}
    public void setBalance(int num){/*code*/}
}
