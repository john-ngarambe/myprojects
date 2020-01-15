package com.ngarambe.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage extends Account {
    protected  double interestPerMonth;
    protected double loanBalance;
    protected double principal;
    protected double monthlyPayment;
    public Mortgage(double monthlyPayment,double interestPerMonth,double loanBalance,double principal)
    {
        this.monthlyPayment = monthlyPayment;
        this.interestPerMonth= interestPerMonth;
        this.loanBalance= loanBalance;
        this.principal = principal;
    }

    public Mortgage() {
        super();
    }

    @Override
    public double calculateMonthlyPayment() {
        double loanAmount =0;
        int termInYears =0;
        double interestRate =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loan amount :");
        loanAmount = scanner.nextInt();
        System.out.println("Enter loan term(in years): ");
        termInYears = scanner.nextInt();
        System.out.println("Enter interest rate : ");
        interestRate = scanner.nextDouble();
        int termInMonths = termInYears * 12;
        double monthlyPaymentWithoutInterest = (loanAmount /termInMonths);
        this.interestPerMonth = (loanAmount/termInMonths)*interestRate;
        this.monthlyPayment = monthlyPaymentWithoutInterest + this.interestPerMonth;
        this.loanBalance = loanAmount- this.monthlyPayment;
        this.principal = this.monthlyPayment - this.interestPerMonth;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat interestFormat = NumberFormat.getPercentInstance();
        System.out.println("Loan Amount : " + currencyFormat.format(loanAmount));
        System.out.println("Loan Term : " + termInYears + " Years");
        System.out.println("Interest Rate= " + interestFormat.format(interestRate));
        System.out.println("Monthly Payment = " + currencyFormat.format(this.monthlyPayment));
        System.out.println("Loan Balance = " + currencyFormat.format(this.loanBalance));
        System.out.println("Principal of Loan payed = " + currencyFormat.format(this.principal));
        System.out.println("Interest on loan payed per month = " + currencyFormat.format(this.interestPerMonth));
        return this.monthlyPayment;

    }

    @Override
    public void executeUpdate(String sql1) {

    }
}

    /*public double  calculateMonthlyPayment(double loanAmount, int termInYears , double interestRate){
        Scanner scanner = new Scanner(System.in);
       int termInMonths = termInYears * 12;
       double monthlyPaymentWithoutInterest = (loanAmount /termInMonths);
       this.interestPerMonth = (loanAmount/termInMonths)*interestRate;
       this.monthlyPayment = monthlyPaymentWithoutInterest+ this.interestPerMonth;
      this.loanBalance = loanAmount-this.monthlyPayment;
      this.principal = this.monthlyPayment - this.interestPerMonth;

        System.out.println("Enter loan amount :");
         loanAmount = scanner.nextInt();
        System.out.println("Enter loan term(in years): ");
         termInYears = scanner.nextInt();
        System.out.println("Enter interest rate : ");
        interestRate = scanner.nextDouble();
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat interestFormat = NumberFormat.getPercentInstance();
        System.out.println("Loan Amount : " + currencyFormat.format(loanAmount));
        System.out.println("Loan Term : " + termInYears + " Years");
        System.out.println("Interest Rate= " + interestFormat.format(interestRate));
        System.out.println("Monthly Payment = " + currencyFormat.format(this.monthlyPayment));
        System.out.println("Loan Balance = " + currencyFormat.format(this.loanBalance));
        System.out.println("Principal of Loan payed = " + currencyFormat.format(this.principal));
        System.out.println("Interest on loan payed per month = " + currencyFormat.format(this.interestPerMonth));
        return monthlyPayment;

   }*/
//}
