/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author ASUS
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksiDB {
    Connection c;
    Statement s;
    ResultSet rs;
    PreparedStatement ps;
    String query;
    
    //method untuk koneksi ke driver dan database
    void setDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error" + ex);
        }
        
        String local = "jdbc:mysql://localhost:3306/library";
        try {
            c = DriverManager.getConnection(local, "root", "");
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }
    
    //method untuk query select
    void read() {
        try {
            s = c.createStatement();
            rs = s.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }
    
    //method untuk query insert, update dan delete
    void CUD() {
        try {
            ps = c.prepareStatement(query);
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }
}
