package com.ngarambe.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Scanner;

public class AccountOperations extends Account {
    public AccountOperations() {
        super();
    }

    @Override
    public double calculateMonthlyPayment() {
        return 0;
    }

    public void createAccount(){
        Connection conn = null;
        Statement statement = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account name to be created:");
        String name = scanner.nextLine();
        this.accountName = name;
        System.out.println("Enter account Type to be created:");
        String accountModel= scanner.nextLine();
        this.accountType =accountModel;
        System.out.println("Enter account number to be created:");
        int account = scanner.nextInt();
        this.accountNumber=account;
        try{
            conn = DbConnection.getConnection();
            if(conn != null){
                System.out.println("Database connected successfully");
                statement = conn.createStatement();
                String sql1 = "INSERT INTO ACCOUNT  VALUES('"+name+"','"+accountModel+"',"+ account+")";
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

    }

    @Override
    public void executeUpdate(String sql1) {

    }

    public double deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount you want to deposit:");
        double depositAmount = scanner.nextDouble();
        return this.balance +=depositAmount;
    }
    public double withdrawal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdrawal:");
        int withdrawalAmount = scanner.nextInt();
        if( this.balance - withdrawalAmount<=0){
            System.out.println("You don't have enough fund on your account!");
            return -1;
        }else
            return this.balance-=withdrawalAmount;
    }
    public void displayDetails(){
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Depositor: "+ accountName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Amount on account: " + currencyFormat.format(balance) );
        //System.out.println("Loan remaining =" + amountDue);
    }
}
