package com.ngarambe.java;

import java.util.Scanner;

public class Customer extends Account {
    protected String Address;
    protected String phoneNumber;
    protected String MaterialStatus;
    protected String Age;

    public Customer(String accountName, String accountType, int accountNumber, int balance,double amountDue,
                    String address, String phoneNumber, String materialStatus, String age) {

        super(accountName, accountType, accountNumber, balance,amountDue);
        Address = address;
        this.phoneNumber = phoneNumber;
        MaterialStatus = materialStatus;
        Age = age;
    }
    public Customer() {

    }
}