package com.exercice2;

	public class Livre {
	    // Variables
	    private String titre, auteur;
	    private int nbPages;

	    // Constructeurs
	    public Livre() {
	    }

	    public Livre(String unAuteur, String unTitre) {
	        auteur = unAuteur;
	        titre = unTitre;
	    }

	    public Livre(String unAuteur, String unTitre, int nbPages) {
	        auteur = unAuteur;
	        titre = unTitre;
	        setNbPages(nbPages);
	    }

	    // Accesseurs
	    public String getTitre() {
	        return titre;
	    }

	    public int getNbPages() {
	        return nbPages;
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

	    // Méthodes
	    public void afficheToi() {
	        System.out.println(toString());
	    }

	    @Override
	    public String toString() {
	        return "Livre{" +
	                "titre='" + titre + '\'' +
	                ", auteur='" + auteur + '\'' +
	                ", nbPages=" + nbPages +
	                '}';
	    }

	    // Méthode main
	    public static void main(String[] args) {
	        // Création des livres en utilisant les différents constructeurs
	        Livre livre1 = new Livre("Auteur 1", "Titre 1", 100);
	        Livre livre2 = new Livre("Auteur 2", "Titre 2", 200);

	        // Affichage du nombre de pages de chaque livre
	        System.out.println("Nombre de pages du livre 1 : " + livre1.getNbPages());
	        System.out.println("Nombre de pages du livre 2 : " + livre2.getNbPages());

	        // Calcul et affichage du nombre de pages total des deux livres
	        int nombrePagesTotal = livre1.getNbPages() + livre2.getNbPages();
	        System.out.println("Nombre de pages total des deux livres : " + nombrePagesTotal);
	    }
	}
	


