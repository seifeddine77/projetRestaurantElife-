/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.restaurant.entities;

/**
 *
 * @author saife
 */
public class Restaurant {
   private  int id;
   private String nom;
   private String phone ;
   private String email;
   private String adresse ; 
   private String speciality; 

    public Restaurant() {
    }

    public Restaurant(int id, String nom, String phone, String email, String adresse , String speciality) {
        this.id = id;
        this.nom = nom;
        this.phone = phone;
        this.email = email;
        this.adresse = adresse;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

  



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", phone=" + phone + ", email=" + email + ", adresse=" + adresse + '}';
    }
   
   
}
