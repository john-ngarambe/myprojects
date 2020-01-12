package com.ngarambe.java;

public class CreateAccount extends AccountOperations {

    public CreateAccount(String name, String type, int number, int initial) {
        accountName = name;
        accountType = type;
        accountNumber =number;
        balance = initial;
    }

    @Override
    public void createAccount() {
        super.createAccount();
        System.out.println("Account is created successfully");
        System.out.println("Account Owner :" + accountName);
        System.out.println("Account Type : " + accountType);
        System.out.println("Account number is :" + accountNumber);
    }

    public CreateAccount() {
        super();

    }
}