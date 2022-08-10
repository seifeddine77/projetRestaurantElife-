/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connexionelife.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AYMEN
 */
public class Myconnetion {
    public String url="jdbc:mysql://localhost:3306/elife";
    public String login="root";
    public String pwd="";
    private Connection cnx;
    public Myconnetion() {
        try  {
            
            System.out.println("aymen");
            
          cnx=  DriverManager.getConnection(url,login,pwd);
            System.out.println("connexion établie");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    public Connection getCnx() {
        return cnx;
    }
    
    
}
