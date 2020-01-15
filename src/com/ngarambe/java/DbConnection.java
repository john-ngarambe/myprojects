package com.ngarambe.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

    public  static Connection getConnection() {
        Connection con= null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=BANK","sa","johndba");
        } catch (SQLException | ClassNotFoundException e) {
         e.printStackTrace();
        }
        return con;
    }
}