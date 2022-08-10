/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connexionelife.gull;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author AYMEN
 */
public class PersonDetailsController implements Initializable {

    @FXML
    private TextField resNom;
    @FXML
    private TextField resPrenom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setResNom(String value) {
        this.resNom.setText(value);
    }

    public void setResPrenom(String value) {
        this.resPrenom.setText(value);
    }
    
    
    
}
