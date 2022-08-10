/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.restaurant.tools;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saife
 */
public class MyConnection {

    
    public String url="jdbc:mySql://localhost:3306/restaurant" ;
    public String login="root";
    public String pwd="";
    private Connection cnx;

    public Connection getCnx() {
        return cnx;
    }

    public void setCnx(Connection cnx) {
        this.cnx = cnx;
    }
    
    public MyConnection() {
        try {
            cnx = DriverManager.getConnection(url,login,pwd);
            System.out.println("CONNECTION....");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                
    }
    
}
