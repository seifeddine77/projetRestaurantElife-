/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connexionelife.gull;

import edu.connexionElif.service.PersonneCRUD;
import edu.connextionelife.entiter.Personne;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author AYMEN
 */
public class FirstPageController implements Initializable {

    @FXML
    private TextField fxNom;
    @FXML
    private TextField fxPrenom;
    @FXML
    private Button btnAjouter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AjouterPersonne(ActionEvent event) {
        
        //SAUVEGARDE DE LA PERSSONE
        String nomP=fxNom.getText();
        String prenomP=fxPrenom.getText();
        Personne p =new Personne(60,nomP,prenomP);
        PersonneCRUD pcd = new PersonneCRUD();
        pcd.ajouterPersonne(p);
        JOptionPane.showMessageDialog(null,"Personne ajoutée");
        
        
        
        
        //REDIRECTION 
//        FXMLLoader loder = new FXMLLoader(getClass().getResource("PersonDetails.fxml"));
//        try {
//            Parent root = loder.load();
//            PersonDetailsController pdc = loder.getController();
//            pdc.setResNom(nomP);
//            pdc.setResPrenom(prenomP);
//            fxNom.getScene().setRoot(root);
//            
//            
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
        
        
    }
    
}
