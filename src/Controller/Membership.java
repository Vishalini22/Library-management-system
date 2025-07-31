/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
 
public class Membership {
    
   public static Connection getConnection() throws SQLException {
    try {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Correct connection URL for the 'membershipdetail' database
        String url = "jdbc:mysql://localhost:3306/memdetail";  // Correct database here
        String username = "root";  // Default username in XAMPP
        String password = "";  // Default password for XAMPP's MySQL

        // Return the connection to the correct database
        return DriverManager.getConnection(url, username, password);

    } catch (ClassNotFoundException | SQLException e) {
        throw new SQLException("Error connecting to the database", e);
    }
}

    
}

