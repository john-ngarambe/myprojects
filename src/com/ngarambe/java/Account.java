package com.ngarambe.java;

import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Scanner;

public abstract class Account extends DbConnection {
    protected String accountName;
    protected String accountType;
    protected int accountNumber;
    protected int balance;
   // protected double amountDue;
    Statement statement= null;

    public Account( String accountName,String accountType,int accountNumber, int balance,double amountDue) {

        this.accountName = accountName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
       // this.amountDue = amountDue;
    }
    public Account() {

    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double getAmountDue(double amountDue){
        return amountDue;
    }
    public void setAmountDue(double amountDue){
        //this.amountDue = amountDue;
    }

    public abstract double calculateMonthlyPayment();

    public abstract void executeUpdate(String sql1);
}
