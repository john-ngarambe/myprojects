package com.ngarambe.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Scanner;

public class BankProject {

    public static void main(String[] args) {

        Connection conn = null;
        Statement statement = null;

        try{
       conn = DbConnection.getConnection();
        if(conn != null){
            System.out.println("Database connected successfully");

            /*statement = conn.createStatement();
             String sql = "CREATE TABLE CUSTOMER" +
                         "( address VARCHAR (255),"+
                         "phoneNumber VARCHAR (255) not NULL,"+
                         "materialStatus  VARCHAR (255)," +
                         "age INTEGER  ,"+
                         "PRIMARY KEY (phoneNumber) )";
            statement.executeUpdate(sql);
            System.out.println("Table Account is created !");*/

         /*   String sql1 = "INSERT INTO ACCOUNT (accountNumber,accountType,accountName)" + "VALUES(?,?,?)";
            statement.executeUpdate(sql1);
            System.out.println("Data inserted successfully");*/
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

        CreateAccount account = new CreateAccount();
        Account mortgage = new Mortgage();
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);

        int choice ;


        do {
            System.out.println("Enter your choice :");
            System.out.println("1: Creating Account");
            System.out.println("2: Making Deposit");
            System.out.println("3: Withdraw on your Account");
            System.out.println("4: Mortgage:");
            System.out.println("5: Customer Details:");
            System.out.println("6: Quit the program:\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account.createAccount();
                    scanner.nextInt();
                    account.executeUpdate("INSERT INTO ACCOUNT VALUES("+account.getAccountName()+ "," +account.getAccountType() + "," +account.getAccountNumber()+")");
                    scanner.nextInt();
                    break;
                case 2:
                    account.deposit();
                    account.displayDetails();
                    scanner.nextInt();
                    break;
                case 3:
                    account.withdrawal();
                    account.displayDetails();
                    scanner.nextInt();
                    break;
                case 4:
                    mortgage.calculateMonthlyPayment();
                    break;
                case 5:
                   customer.createAccount();
                   customer.executeUpdate("INSERT INTO CUSTOMER VALUES(" + customer.getAddress()+ "," +customer.getPhoneNumber()+","+customer.getMaterialStatus()+","+customer.getAge());
                    break;
                case 6:
                    System.out.println("Quit the program!");
                    break;
                default: System.out.println("You Entered Wrong choice");

            }
        }while(choice != 6);
        System.out.println("Bye bye see next time!");
    }
}
