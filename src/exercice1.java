public class Livre {
    
    private String titre, auteur;
    private int nbPages; // Ajout du point-virgule manquant

    
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    
    public String getAuteur() {
        return auteur;
    }

    
    public void setNbPages(int n) { // Correction du nom de paramètre 'n'
        nbPages = n; // Correction de la variable 'nb' à 'n'
    }

    
    public static void main(String[] args) {
        Livre livre1 = new Livre("Auteur1", "Titre1"); // Création du premier livre
        Livre livre2 = new Livre("Auteur2", "Titre2"); // Création du deuxième livre
        
        // Affichage des auteurs des deux livres
        System.out.println("Auteur du livre 1 : " + livre1.getAuteur());
        System.out.println("Auteur du livre 2 : " + livre2.getAuteur());
    }
}
