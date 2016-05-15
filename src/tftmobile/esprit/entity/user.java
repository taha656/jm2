/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tftmobile.esprit.entity;

/**
 *
 * @author Mariem R
 */
public class user {
    private String nom ;
    private String prenom ;
    private int rangjoueur ;
      public user (){}
    public user(String nom, String prenom, int rangjoueur) {
        this.nom = nom;
        this.prenom = prenom;
        this.rangjoueur = rangjoueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getRangjoueur() {
        return rangjoueur;
    }

    public void setRangjoueur(int rangjoueur) {
        this.rangjoueur = rangjoueur;
    }
    
}
