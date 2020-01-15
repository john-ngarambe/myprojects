package com.ngarambe.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Customer extends CreateAccount {
    protected String address;
    protected String phoneNumber;
    protected String materialStatus;
    protected int age;

    public Customer(String address, String phoneNumber, String materialStatus, int age) {

        //super();
       this. address = address;
        this.phoneNumber = phoneNumber;
        this.materialStatus = materialStatus;
        this.age = age;
        /*this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balance = balance;*/
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMaterialStatus() {
        return materialStatus;
    }

    public void setMaterialStatus(String materialStatus) {
        this.materialStatus = materialStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer() {
    super();
    }
    @Override
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        Connection conn = null;
        Statement statement = null;
       // super.createAccount();
        System.out.println("Enter Customer Address:");
        String address = scanner.nextLine();
        this.address = address;
        System.out.println("Enter the Phone number :");
        String phoneNumber = scanner.nextLine();
        this.phoneNumber = phoneNumber;
        System.out.println("Enter Material Status :");
        String materialStatus = scanner.nextLine();
        this.materialStatus = materialStatus;
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        this.age = age;
        //------------------------
        try{
            conn = DbConnection.getConnection();
            if(conn != null){
                System.out.println("Database connected successfully");
                statement = conn.createStatement();
                String sql1 = "INSERT INTO ACCOUNT  VALUES('"+address+"','"+phoneNumber+"','"+materialStatus+"',"+age+")";
                statement.executeUpdate(sql1);
                System.out.println("Data inserted successfully");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(statement!=null)
                    conn.close();
            }catch(SQLException se){

            }
            if(conn != null){
                try {
                    conn.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        super.createAccount();
        System.out.println("Loan Amount :" + this.balance);
        System.out.println("Account Owner : " + this.accountName );
        System.out.println("Account Type :" + this.accountType);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("The Address is : " + this.address);
        System.out.println("Phone number : " + this.phoneNumber);
        System.out.println("Material Status : " + this.materialStatus);
        System.out.println("Customer Age : " + this.age);

    }

   /* @Override
    public double calculateMonthlyPayment() {


        System.out.println("Enter Customer Address:");
        String address = scanner.nextLine();
        this.address = address;
        System.out.println("Enter the Phone number :");
        String phoneNumber = scanner.nextLine();
        this.phoneNumber = phoneNumber;
        System.out.println("Enter Material Status :");
        String materialStatus = scanner.nextLine();
        this.materialStatus = materialStatus;
        System.out.println("Enter your Age: ");
        double age = scanner.nextInt();
        this.age = age;
        System.out.println("Loan Amount :" + this.balance);
        System.out.println("Account Owner : " + this.accountName );
        System.out.println("Account Type :" + this.accountType);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("The Address is : " + this.address);
        System.out.println("Phone number : " + this.phoneNumber);
        System.out.println("Material Status : " + this.materialStatus);
        System.out.println("Customer Age : " + this.age);
        return getBalance();

    }*/
}