/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Livre;

/**
 *
 * @author Danny Rand
 */


public class Javatp1 {
    private String titre, auteur;
    private int nbPages;
    
    public Javatp1 (String unAuteur, String unTitre){
        auteur = unAuteur;
        titre = unTitre;
    }
    public String getAuteur(){
        return auteur;
    }
    public void setNbPages(int nb){
        nbPages = nb;
    }
    public static void main(String args []){
        Javatp1 L1 = new Javatp1 ("Auteur1", "Titre1");
        Javatp1 L2 = new Javatp1 ("Auteur2", "Auteur2");
        System.out.println("Auteur du livre 1 est " +L1.getAuteur());
        System.out.println( "Auteur du livre 2 est " +L2.getAuteur());
    }
}