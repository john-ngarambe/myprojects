package com.ngarambe.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class AccountOperations extends Account {
    public AccountOperations() {
        super();
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
