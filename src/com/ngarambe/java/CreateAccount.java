package com.ngarambe.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
        System.out.println("Account Owner :" + this.getAccountName());
        System.out.println("Account Type : " + this.getAccountType());
        System.out.println("Account number is :" + this.getAccountNumber());
    }
    public CreateAccount() {
        super();

    }
}