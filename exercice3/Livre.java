package com.exercice3;

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
		        this.nbPages = nbPages;
		    }

		    // Accesseurs
		    public String getAuteur() {
		        return auteur;
		    }

		    // Modificateurs
		    public void setNbPages(int n) {
		        nbPages = n;
		    }

		    // M�thodes
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
	
	   // M�thode main
    public static void main(String[] args) {
        // Cr�ation des livres en utilisant les diff�rents constructeurs
        Livre livre1 = new Livre("Auteur 1", "Titre 1");
        Livre livre2 = new Livre("Auteur 2", "Titre 2", 300);
        Livre livre3 = new Livre();

        livre1.afficheToi();
        livre2.afficheToi();
        livre3.setNbPages(300);
        livre3.afficheToi();
    }
	}


