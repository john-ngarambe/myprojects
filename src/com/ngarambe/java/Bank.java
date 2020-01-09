package com.ngarambe.java;

public class Bank {
    protected String bankCode;
    protected String bankName;
    protected String bankType;

    public Bank(String bankCode, String bankName, String bankType) {
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.bankType = bankType;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }
}
