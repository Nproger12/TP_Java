/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADRIAN
 */
public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages;
    // Constructeur
    public Livre(String unAuteur, String unTitre,int np) {
    auteur = unAuteur;
    titre = unTitre;
    nbPages = np;
    }
    public Livre(String unAuteur,String unTitre) {
    auteur = unAuteur;
    titre = unTitre;
    }
    public Livre() {
    auteur = "inconnu";
    titre = "inconnu";
    nbPages = 0;
    }
    // Accesseur
    public String getAuteur() {
    return auteur;
    }
    public String getTitre(){
    return titre;
    }
    public int getNbrePage(){
    return nbPages;
    }
    // Modificateur
    void setNbPages(int n) {
    if(n>0)
        nbPages = n;
    else
        System.out.println("Erreur!!,Entrer une valeur positive");
    }
    void setAuteur(String Aut){
      auteur = Aut;
    }
    void setTitre(String T){
      titre = T;
    }
     // Méthode pour afficher une description du livre
    /*public void afficheToi() {
        System.out.println("Livre :");
        System.out.println("Auteur : " + auteur);
        System.out.println("Titre : " + titre);
        System.out.println("Nombre de pages : " + nbPages);
    } */
    //methode avec toString 
     public String toString() {
        return "Livre :\n" +
               "Auteur : " + auteur + "\n" +
               "Titre : " + titre + "\n" +
               "Nombre de pages : " + nbPages;
    }
}
