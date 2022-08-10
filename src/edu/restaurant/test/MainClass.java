/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.restaurant.test;

import edu.restaurant.entities.Client;
import edu.restaurant.services.ClientCRUD;
import edu.restaurant.tools.MyConnection;

/**
 *
 * @author saife
 */
public class MainClass {

    public static void main(String[] args) {
        MyConnection mc = new MyConnection();
        Client c = new Client(1, "seif", "rezgui", "97805023", "seif@gmail.com", "Gaafour");
        Client c1 = new Client(2, "karim", "benzema", "97805023", "karim@gmail.com", "Madrid");
        ClientCRUD ccr = new ClientCRUD();
        ccr.ajouterClient(c);
        ccr.ajouterClient(c1);

    }
}
