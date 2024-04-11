package com.exercice1;

	public class Livre {
	    // Variables
	    private String titre, auteur;
	    private int nbPages;

	    // Constructeur
	    public Livre(String unAuteur, String unTitre) {
	        auteur = unAuteur;
	        titre = unTitre;
	    }

	    // Accesseur
	    public String getAuteur() {
	        return auteur;
	    }

	    // Modificateur
	    public void setNbPages(int n) {
	        nbPages = n;
	    }

	    // Méthode main
	    public static void main(String[] args) {
	        // Création des livres
	        Livre livre1 = new Livre("Auteur 1", "Titre 1");
	        Livre livre2 = new Livre("Auteur 2", "Titre 2");

	        // Affichage des auteurs des livres
	        System.out.println("Auteur du livre 1 : " + livre1.getAuteur());
	        System.out.println("Auteur du livre 2 : " + livre2.getAuteur());
	    }
	}

