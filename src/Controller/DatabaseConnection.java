

package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Use the correct connection URL for MySQL in XAMPP
            String url = "jdbc:mysql://localhost:3306/library";  // "localhost" is used for local servers
            String username = "root";  // Default username in XAMPP
            String password = "";  // Default is no password in XAMPP's MySQL

            // Return the connection to the database
            return DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Error connecting to the database", e);
        }
    }
    
}
