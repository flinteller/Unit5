package com.company;

public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account(String first, String last, double balance){
        this.first = first;
        this.last = last;
        this.balance = balance;
        this.acctNum = (int) (Math.random() * 1000) + 1;
    }

    public Account(Account account){
        this(account.first, account.last, account.balance);
    }

    public Account(){
        this("", "", 0.0);
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdrawal(double amount){
        if(amount > balance)
            return false;
        else {
            balance -= amount;
            return true;
        }
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String toString(){
        return "Customer Name: " + first + " " + last + "\nAccount #: " + acctNum + "\nCurrent Balance: $" + balance;
    }

}