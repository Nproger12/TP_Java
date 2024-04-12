/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp4;

/**
 *
 * @author Danny Rand
 */
public class Livre3 {
    private String titre, auteur;
    private int nbpages;
    //constructeur avec deux parametres
    public Livre3(String unAuteur, String unTitre, int unNbpages){
        auteur = unAuteur;
        titre = unTitre;
        nbpages = unNbpages;
    }
    // constructeur avec un parametre
    public Livre3( int unNbpages){
        nbpages = unNbpages;
    }
    // constructeur avec aucun parametre
    public Livre3(){
    }
    
    public String getTitre(){
        return titre;
    }
    
    public String getAuteur(){
        return auteur;
    }
    
    public int getNbpages(){
        return nbpages;
    }
    
    void setAuteur(String aut){
        auteur = aut;
    }
    
    void setTitre(String Titre){
        titre = Titre;
    }
    
    void setNbpages(int nb){
        if(nb>0){
            nbpages = nb;
        }
        else{
            System.out.println("error!!!!!");
        }
    }
    // Méthode pour afficher les informations du livre
    public void afficheToi() {
        System.out.println("Livre : " + titre + " par " + auteur + " - " + nbpages + " pages");
    }
    
     public static void main(String args []){
        Livre3 L1 = new Livre3 ("PC Ombete Bella", "Les tribus de Capitoline", 30);
        Livre3 L2 = new Livre3 ("Andre Brink", "Une saison Blanche et seche", 50);
        Livre3 monLivre = new Livre3("Stephen King", "Ça", 1138);
        //somme des pages du livre L1 et L2
        int somme = +L1.getNbpages() + +L2.getNbpages();
        
        L1.afficheToi();
        System.out.println();
        L2.afficheToi();
        System.out.println();
        monLivre.afficheToi(); // Appel de la méthode afficheToi() pour afficher les informations du livre
        System.out.println();
        System.out.println("L'Auteur du livre 1 est " +L1.getAuteur());
        System.out.println();
        System.out.println( "Le titre du livre 1 est " +L1.getTitre());
        System.out.println();
        System.out.println( "Le Nombre de page du livre 1 est " +L1.getNbpages());
        System.out.println();
        System.out.println( "L'Auteur du livre 2 est " +L2.getAuteur());
        System.out.println();
        System.out.println( "Le titre du livre 2 est " +L2.getTitre()); 
        System.out.println();
        System.out.println( "Le Nombre de page du livre 2 est " +L2.getNbpages());
        System.out.println();
        System.out.println( "La somme des pages des deux oeuvres est :" + somme + "pages !!!");
    }
     
}