package com.ngarambe.java;

public class BankProject {

    public static void main(String[] args) {
        Bank bk = new Bank("*555#","Equity Bank","Commercial Bank");
	    Customer ct = new Customer("*555#","Equity Bank","Commercial Bank",
                "1415", "John","Ngarambe",0);
	             ct.deposit(2000);
        System.out.println("BankName  : " + ct.bankName);
        System.out.println("Bank Type : " + ct.bankType);
        System.out.println("AccountNumber : " + ct.customerAccount );
        System.out.println("Names : " + ct.customerFirstName + "  " + ct.customerLastName);
        System.out.println( "Balance on current account = "+ ct.getAmount());

    }
}
