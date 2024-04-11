public class Livre {
    
    private String titre, auteur;
    private int nbPages;

    
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    
    public String getTitre() {
        return titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    
    public void setAuteur(String unAuteur) {
        auteur = unAuteur;
    }

    public void setTitre(String unTitre) {
        titre = unTitre;
    }

    public void setNbPages(int n) {
        if (n > 0) { // Vérification si le nombre de pages est positif
            nbPages = n;
        } else {
            System.out.println("Erreur : Le nombre de pages doit être positif.");
        }
    }

   
    public static void main(String[] args) {
        Livre livre1 = new Livre("Auteur1", "Titre1"); // Création du premier livre
        Livre livre2 = new Livre("Auteur2", "Titre2"); // Création du deuxième livre
        
        // Ajout du nombre de pages pour chaque livre
        livre1.setNbPages(200);
        livre2.setNbPages(150);
        
        // Affichage du nombre de pages de chaque livre
        System.out.println("Nombre de pages du livre 1 : " + livre1.getNbPages());
        System.out.println("Nombre de pages du livre 2 : " + livre2.getNbPages());
        
        // Calcul du nombre total de pages des deux livres
        int totalPages = livre1.getNbPages() + livre2.getNbPages();
        System.out.println("Nombre total de pages des deux livres : " + totalPages);
    }
}
