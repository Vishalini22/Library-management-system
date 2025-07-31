/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */

    import Model.Member;
import java.sql.*;
import java.util.Calendar;

/**
 *
 * @author Dell
 */

    
 public class addMember extends Membership {

private static Connection connection (){

Connection conn = null;

try {

conn = Membership. getConnection ();

}

catch (SQLException e){
System. out. println(e) ;
}
return conn;

}

public boolean membershipdetail(Member addMember) {
    
    Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.DECEMBER, 31); // Set expiry date to December 31, 2025
        Date expiryDate = new Date(calendar.getTimeInMillis()); // Use java.sql.Date
        
     
    
        
   String sql = "INSERT INTO memdetail.detail ( Name, Address, Contact, Password, Membership, Expiry) VALUES (?, ?, ?, ?, ?, ?)";

    try (Connection conn = connection(); 
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        
        ps.setString(1, addMember.getName());
        ps.setString(2, addMember.getAddress());
        ps.setString(3,addMember.getContact());
        ps.setString(4,addMember.getPass());
         
         String membership = addMember.getMembership();
        if (membership != null && !membership.isEmpty()) {
            ps.setString(5, membership);
        } else {
            ps.setNull(5, Types.VARCHAR);  // Explicitly set NULL if membership is empty
        }

          ps.setDate(6, (Date) addMember.getExpiry());
         
        
        
        // Execute the insert query and check if the data is inserted
        int rowsAffected = ps.executeUpdate();
        return rowsAffected > 0;  // If rows were affected, the data was inserted successfully
    } catch (SQLException ex) {
        System.out.println("SQL Error: " + ex.getMessage());
        
    }
    return false;
}

    
}

   

