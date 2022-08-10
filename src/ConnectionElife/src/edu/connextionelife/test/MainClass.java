/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connextionelife.test;

import edu.connexionElif.service.PersonneCRUD;
import edu.connexionelife.tools.Myconnetion;
import edu.connextionelife.entiter.Personne;

/**
 *
 * @author AYMEN
 */
public class MainClass {
    public static void main(String[]args){
        
        Personne p  = new Personne (0,"nada","chebbi");
        PersonneCRUD pcr = new PersonneCRUD();
        pcr.ajouterPersonne(p);
        Personne p1  = new Personne (0,"nada1","cheEEEEbbi");
pcr.ajouterPersonne2(p1);
                
          
    }
}
