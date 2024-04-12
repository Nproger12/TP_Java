public class Livre {
   
    private String titre, auteur;
    private int nbPages;

    // Constructeur
    public Livre(String unAuteur, String unTitre, int n) {
        auteur = unAuteur;
        titre = unTitre;
        nbPages = n;
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
        Livre livre1 = new Livre("Auteur1", "Titre1", 100);
        Livre livre2 = new Livre("Auteur2", "Titre2", 150);

        System.out.println("Livre 1 : " + livre1.getTitre() + " - " + livre1.getAuteur() + " (" + livre1.getNbPages() + " pages)");
        System.out.println("Livre 2 : " + livre2.getTitre() + " - " + livre2.getAuteur() + " (" + livre2.getNbPages() + " pages)");
    }
}
