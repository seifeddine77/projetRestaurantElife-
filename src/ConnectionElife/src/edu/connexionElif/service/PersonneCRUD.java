/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connexionElif.service;

import com.mysql.jdbc.MySQLConnection;
import edu.connexionelife.tools.Myconnetion;
import edu.connextionelife.entiter.Personne;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/**
 *
 * @author AYMEN
 */
public class PersonneCRUD {
    public void ajouterPersonne(Personne p){
    
    String requete = "INSERT INTO personne(nom,prenom)VALUES('"+p.getNom()+"','"+p.getPrenom() +"')";
        try {
            Statement st = new Myconnetion().getCnx().createStatement();
            st.executeUpdate(requete);
            System.out.println("Personne ajouter avec succés");
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
         
    }
    public void ajouterPersonne2(Personne p){
                 String requete = "INSERT INTO personne(nom,prenom)VALUES(?,?)";
        try {
            PreparedStatement pst = new Myconnetion().getCnx().prepareStatement(requete);
            pst.setString(1,p.getNom());
            pst.setString(2,p.getPrenom());
            pst.executeUpdate();
            System.out.println("Person added");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
         }
    public List<Personne> listerPersonnes(){
    
    ArrayList<Personne> myList=new ArrayList();
    
    String requete = "SELECT * FROM personne";
        try {
            Statement st = new Myconnetion().getCnx().createStatement();
            ResultSet rs=st.executeQuery(requete);
            
            while(rs.next()){
                Personne p = new Personne();
                 p.setId(rs.getInt(1));
                    p.setNom(rs.getString("nom"));
                      p.setPrenom(rs.getString("prenom"));
            
            
            }
            
            
            
            
            
        } catch (SQLException ex) {
   System.out.println(ex.getMessage()); 
      
        
        }
          return myList;
    }

    
}
