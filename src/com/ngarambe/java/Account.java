package com.ngarambe.java;

import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public  class Account {
    protected String accountName;
    protected String accountType;
    protected int accountNumber;
    protected int balance;
   // protected double amountDue;

    public Account(String accountName, String accountType, int accountNumber, int balance,double amountDue) {
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
    public void createAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account name to be created:");
        String name = scanner.nextLine();
        this.accountName = name;
        System.out.println("Enter account Type to be created:");
        String accountModel= scanner.nextLine();
        this.accountType =accountModel;
        System.out.println("Enter account number to be created:");
        int account = scanner.nextInt();
        this.accountNumber=account;


    }
    public double deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount you want to deposit:");
        double depositAmount = scanner.nextDouble();
        return this.balance +=depositAmount;
    }
    public double withdrawal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdrawal:");
        int withdrawalAmount = scanner.nextInt();
        if( this.balance - withdrawalAmount<=0){
            System.out.println("You don't have enough fund on your account!");
            return -1;
        }else
            return this.balance-=withdrawalAmount;
    }
    public void displayDetails(){
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Depositor: "+ accountName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Amount on account: " + currencyFormat.format(balance) );
        //System.out.println("Loan remaining =" + amountDue);
    }
}
