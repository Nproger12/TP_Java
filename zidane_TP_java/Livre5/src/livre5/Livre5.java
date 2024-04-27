/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livre5;

/**
 *
 * @author Danny Rand
 */
public class Livre5{
    // Variables
    private String titre;
    private String auteur;
    private int nbPages;
    private float Prix;
    private boolean PrixFixe;
    // Constructeur
    public Livre5(String unAuteur, String unTitre, int nbpages, float prix) {
    auteur = unAuteur;
    titre = unTitre;
    nbPages = nbpages;
    if(prix>0)
        Prix = prix;
    else
        System.out.println("Ereur!! Entrer un prix positif");
    PrixFixe = false;
    }
    public Livre5(String unAuteur,String unTitre) {
    auteur = unAuteur;
    titre = unTitre;
    }
    public Livre5() {
    auteur = " ";
    titre = " ";
    nbPages = 0;
    PrixFixe = true;
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
    public float getPrix(){
        return Prix;
    }
    
    // Modificateur
    void setNbPages(int nb) {
    if(nb>0)
        nbPages = nb;
    else
        System.out.println("Error!!!!");
    }
    void setAuteur(String Aut){
      auteur = Aut;
    }
    void setTitre(String T){
      titre = T;
    }
    void SetPrix(float prix){
        if(!PrixFixe){
            Prix = prix;
            PrixFixe = true;
        }
        else {
            System.out.println("Erreur : Le prix a déjà été fixé et ne peut pas être modifié.");
        }
    }
     // Méthode pour afficher une description du livre
    /*public void afficheToi() {
        System.out.println("Livre :");
        System.out.println("Auteur : " + auteur);
        System.out.println("Titre : " + titre);
        System.out.println("Nombre de pages : " + nbPages);
    } */
    //methode avec toString 
    public String ToString() {
        if (Prix > 0) {
            return "Livre4 :\n" +
                   "Auteur : " + auteur + "\n" +
                   "Titre : " + titre + "\n" +
                   "Nombre de pages : " + nbPages + "\n" +
                   "Prix : " + Prix + "Fcfa";
        } else {
            return "Livre4 :\n" +
                   "Auteur : " + auteur + "\n" +
                   "Titre : " + titre + "\n" +
                   "Nombre de pages : " + nbPages + "\n" +
                   "Prix : Prix pas encore fixé";
            }
    }
    
    public void afficheToi(){
        System.out.println(ToString());
    }
    
    public static void main(String args[]){
        Livre5 L1 = new Livre5("Nachare","POO",50,150000);
        L1.afficheToi();
        
        
}
    
}


