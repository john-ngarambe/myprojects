package com.ngarambe.java;

public class Customer extends Bank {
    protected String customerAccount;
    protected String customerFirstName;
    protected String customerLastName;
    protected long balance;

    public Customer(String bankCode, String bankName, String bankType, String customerAccount,
                    String customerFirstName, String customerLastName, long balance) {
        super(bankCode, bankName, bankType);
        this.customerAccount = customerAccount;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.balance = balance;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public long getAmount() {
        return balance;
    }

    public void setAmount(long amount) {
        this.balance = balance;
    }
    public long deposit(int amount){
      return this.balance +=amount;
    }
}
