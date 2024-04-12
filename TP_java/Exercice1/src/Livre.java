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
        public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
        }
        // Accesseur
        public String getAuteur() {
        return auteur;
        }
        public String getTitre(){
            return titre;
        }
        // Modificateur
        void setNbPages(int n) {
        nbPages = n;
        }
}
