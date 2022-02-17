package Pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseOperation {

    private static Connection connection;

    public static Connection getConnection() {
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","veera","veera0407");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("  "+ex);
        }
        return connection;
    }
    
    
}