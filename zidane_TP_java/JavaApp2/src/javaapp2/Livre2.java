/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp2;

/**
 *
 * @author Danny Rand
 */
public class Livre2 {
    private String titre, auteur;
    private int nbpages;
    
    public Livre2(String unAuteur, String unTitre, int unNbpages){
        auteur = unAuteur;
        titre = unTitre;
        nbpages = unNbpages;
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
    
     public static void main(String args []){
        Livre2 L1 = new Livre2 ("PC Ombete Bella", "Les tribus de Capitoline", 30);
        Livre2 L2 = new Livre2 ("Andre Brink", "Une saison Blanche et seche", 50);
        int somme = +L1.getNbpages() + +L2.getNbpages();
        System.out.println("L'Auteur du livre 1 est " +L1.getAuteur());
        System.out.println( "Le titre du livre 1 est " +L1.getTitre());
        System.out.println( "Le Nombre de page du livre 1 est " +L1.getNbpages());
        System.out.println( "L'Auteur du livre 2 est " +L2.getAuteur());
        System.out.println( "Le titre du livre 2 est " +L2.getTitre()); 
        System.out.println( "Le Nombre de page du livre 2 est " +L2.getNbpages());
        System.out.println( "La somme des pages des deux oeuvres est :" + somme + "pages !!!");
    }
     
}
