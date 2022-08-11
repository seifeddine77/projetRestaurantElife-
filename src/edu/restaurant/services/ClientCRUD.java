/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.restaurant.services;

import edu.restaurant.entities.Client;
import edu.restaurant.tools.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saife
 */
public class ClientCRUD {

    public void ajouterClient(Client c) {
        try {
            String requete = "INSERT INTO client (nom,prenom,phone,email,adresse) VALUES(?,?,?,?,?) ";
            PreparedStatement pst = new MyConnection().getCnx().prepareStatement(requete);
            
            pst.setString(1, c.getNom());
            pst.setString(2, c.getPrenom());
            pst.setString(3, c.getPhone());
            pst.setString(4, c.getEmail());
            pst.setString(5, c.getAdresse());
            pst.executeUpdate();
            System.out.println("Client ajouté ☻");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
