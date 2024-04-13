package com.exercice4;

public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;

    // Constructeurs
    public Livre() {
        prixFixe = false;
    }

    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
        prixFixe = false;
    }

    public Livre(String unAuteur, String unTitre, int nbPages) {
        auteur = unAuteur;
        titre = unTitre;
        setNbPages(nbPages);
        prixFixe = false;
    }

    public Livre(String unAuteur, String unTitre, double prix) {
        auteur = unAuteur;
        titre = unTitre;
        setPrix(prix);
        prixFixe = true;
    }

    // Accesseurs
    public String getTitre() {
        return titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public double getPrix() {
        return prix;
    }

    // Modificateurs
    public void setAuteur(String unAuteur) {
        auteur = unAuteur;
    }

    public void setTitre(String unTitre) {
        titre = unTitre;
    }

    public void setNbPages(int n) {
        if (n > 0) {
            nbPages = n;
        } else {
            System.out.println("Le nombre de pages doit être un nombre positif.");
        }
    }

    public void setPrix(double p) {
        if (!prixFixe) {
            prix = p;
            prixFixe = true;
        } else {
            System.out.println("Le prix a déjà été fixé et ne peut pas être modifié.");
        }
    }

    // Méthodes
    public void afficheToi() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String description = "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nbPages=" + nbPages;
        if (prixFixe) {
            description += ", prix=" + prix;
        } else {
            description += ", prix pas encore fixé";
        }
        description += '}';
        return description;
    }

    // Méthode main
    public static void main(String[] args) {
        Livre livre1 = new Livre("Auteur 1", "Titre 1");
        Livre livre2 = new Livre("Auteur 2", "Titre 2", 300);
        Livre livre3 = new Livre("Auteur 3", "Titre 3");

        livre1.setPrix(19.99);
        livre2.setPrix(29.99);
        livre3.setPrix(39.99); // Tentative de modification du prix, affiche un message d'erreur

        livre1.afficheToi();
        livre2.afficheToi();
        livre3.afficheToi();
    }
}

