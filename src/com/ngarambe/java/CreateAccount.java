package com.ngarambe.java;

public class CreateAccount extends Account {

    public CreateAccount(String name, String type, int number, int initial) {
        accountName = name;
        accountType = type;
        accountNumber =number;
        balance = initial;
    }

    public CreateAccount() {
        super();
    }
}