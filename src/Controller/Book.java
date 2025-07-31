/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.BookModel;
import java.sql.*;

/**
 *
 * @author Dell
 */

    
 public class Book extends DatabaseConnection {

private static Connection connection (){

Connection conn = null;

try {

conn = DatabaseConnection. getConnection ();

}

catch (SQLException e){
System. out. println(e) ;
}
return conn;

}

public boolean addbook(BookModel book) {
    String sql = "INSERT INTO addbook (ID,Title, Author, Year, Category) VALUES (?, ?, ?, ?,?)";
    try (Connection conn = connection(); 
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
         ps.setInt(1, book.getID());
        ps.setString(2, book.getTitle());
        ps.setString(3, book.getAuthor());
        ps.setInt(4,book.getYear());
        ps.setString(5,book.getCategory());
        
        // Execute the insert query and check if the data is inserted
        int rowsAffected = ps.executeUpdate();
        return rowsAffected > 0;  // If rows were affected, the data was inserted successfully
    } catch (SQLException ex) {
        System.out.println("SQL Error: " + ex.getMessage());
        
    }
    return false;
}
}

   