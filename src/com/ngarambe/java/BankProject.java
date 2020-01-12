package com.ngarambe.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class BankProject {

    public static void main(String[] args) {
       /* Bank bk = new Bank("*555#","Equity Bank","Commercial Bank");
	    Customer ct = new Customer("*555#","Equity Bank","Commercial Bank",
                "1415", "John","Ngarambe",0);
	             ct.deposit();
	             ct.withdrawal();
        System.out.println("BankName  : " + ct.bankName);
        System.out.println("Bank Type : " + ct.bankType);
        System.out.println("AccountNumber : " + ct.customerAccount );
        System.out.println("Names : " + ct.customerFirstName + "  " + ct.customerLastName);
        System.out.println( "Balance on current account = "+ ct.getBalance());*/

       //CreateAccount account = new CreateAccount();
       //Mortgage mortgage = new Mortgage();

       //account.createAccount();
       //account.deposit();
       //account.withdrawal();
       //account.displayDetails();

       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter loan amount :");
        //int loanAmount = scanner.nextInt();
       // System.out.println("Enter loan term(in years): ");
       // int termInYears = scanner.nextInt();
        //System.out.println("Enter interest rate : ");
       // double interestRate = scanner.nextDouble();
        //double monthlyPayment = mortgage.calculateMonthlyPayment(loanAmount,termInYears,interestRate);

        //NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
       // NumberFormat interestFormat = NumberFormat.getPercentInstance();

        //System.out.println("Loan Amount : " + currencyFormat.format(loanAmount));
       // System.out.println("Loan Term : " + termInYears+ " Years");
       // System.out.println("Interest Rate= " +interestFormat.format(interestRate));
      //  System.out.println("Monthly Payment = " + currencyFormat.format(monthlyPayment));
       // System.out.println("Loan Balance = " + currencyFormat.format(mortgage.loanBalance));
       // System.out.println("Principal of Loan payed = " + currencyFormat.format(mortgage.principal));
       // System.out.println("Interest on loan payed per month = " + currencyFormat.format(mortgage.interestPerMonth));
        CreateAccount account = new CreateAccount();
        Mortgage mortgage = new Mortgage();
        Scanner scanner = new Scanner(System.in);


       // System.out.println("Enter your choice :");
        int choice ;
        // System.out.println("Enter loan amount :");
       // int loanAmount = scanner.nextInt();
        // System.out.println("Enter loan term(in years): ");
        //int termInYears = scanner.nextInt();
        //System.out.println("Enter interest rate : ");
        //double interestRate = scanner.nextDouble();
        //double monthlyPayment = mortgage.calculateMonthlyPayment(loanAmount,termInYears,interestRate);

        //NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        //NumberFormat interestFormat = NumberFormat.getPercentInstance();

        do {
            System.out.println("Enter your choice :");
            System.out.println("1: Creating Account");
            System.out.println("2: Making Deposit");
            System.out.println("3: Withdraw on your Account");
            System.out.println("4: Mortgage:");
            System.out.println("5: Quit the program:\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account.createAccount();
                    scanner.nextInt();
                    break;
                case 2:
                    account.deposit();
                    account.displayDetails();
                    scanner.nextInt();
                    break;
                case 3:
                    account.withdrawal();
                    account.displayDetails();
                    scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Enter loan amount :");
                   int loanAmount = scanner.nextInt();
                    System.out.println("Enter loan term(in years): ");
                   int termInYears = scanner.nextInt();
                    System.out.println("Enter interest rate : ");
                   double interestRate = scanner.nextDouble();
                    double monthlyPayment = mortgage.calculateMonthlyPayment(loanAmount, termInYears, interestRate);
                    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
                    NumberFormat interestFormat = NumberFormat.getPercentInstance();
                    System.out.println("Loan Amount : " + currencyFormat.format(loanAmount));
                    System.out.println("Loan Term : " + termInYears + " Years");
                    System.out.println("Interest Rate= " + interestFormat.format(interestRate));
                    System.out.println("Monthly Payment = " + currencyFormat.format(monthlyPayment));
                    System.out.println("Loan Balance = " + currencyFormat.format(mortgage.loanBalance));
                    System.out.println("Principal of Loan payed = " + currencyFormat.format(mortgage.principal));
                    System.out.println("Interest on loan payed per month = " + currencyFormat.format(mortgage.interestPerMonth));
                    scanner.nextInt();
                    break;
                case 5:
                    break;
                default: System.out.println("You Entered Wrong choice");

            }
        }while(choice != 5);
    }
}
