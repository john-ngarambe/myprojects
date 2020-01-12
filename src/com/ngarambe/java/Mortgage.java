package com.ngarambe.java;

public class Mortgage {
    protected double loanBalance;
    protected double principal ;
    protected double interestPerMonth;

    public Mortgage() {
        this.loanBalance = loanBalance;
        this.principal = principal;
        this.interestPerMonth = interestPerMonth;
    }

    public double  calculateMonthlyPayment(int loanAmount , int termInYears , double interestRate){
      //interestRate/=100.0;
       //double monthlyRate = interestRate/12.0;
       int termInMonths = termInYears * 12;
       //double monthlyPayment = (loanAmount * monthlyRate)/1-Math.pow(1+monthlyRate,-termInMonths);
       double monthlyPaymentWithoutInterest = (loanAmount /termInMonths);
       this.interestPerMonth = (loanAmount/termInMonths)*interestRate;
       double monthlyPayment = monthlyPaymentWithoutInterest+ this.interestPerMonth;
      this.loanBalance = loanAmount-monthlyPayment;
      this.principal = monthlyPayment - this.interestPerMonth;
       return monthlyPayment;


   }
}
