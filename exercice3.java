public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages;

    // Constructeur
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    // Accesseurs
    public String getAuteur() {
        return auteur;
    }

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
            System.out.println("Erreur : Le nombre de pages doit être positif.");
        }
    }

    // Méthode main
    public static void main(String[] args) {
        Livre livre1 = new Livre("Auteur1", "Titre1");
        Livre livre2 = new Livre("Auteur2", "Titre2");

        livre1.setNbPages(100);
        livre2.setNbPages(150);

        System.out.println("Nombre de pages du livre 1 : " + livre1.getNbPages());
        System.out.println("Nombre de pages du livre 2 : " + livre2.getNbPages());

        int totalPages = livre1.getNbPages() + livre2.getNbPages();
        System.out.println("Nombre total de pages des deux livres : " + totalPages);

        if (livre1.getNbPages() > livre2.getNbPages()) {
            System.out.println("Le livre 1 a plus de pages que le livre 2.");
        } else if (livre1.getNbPages() < livre2.getNbPages()) {
            System.out.println("Le livre 2 a plus de pages que le livre 1.");
        } else {
            System.out.println("Les deux livres ont le même nombre de pages.");
        }
    }
}
