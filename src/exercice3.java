public class Livre {
    
    private String titre, auteur;
    private int nbPages;

    // Constructeurs
    public Livre() {
        // Constructeur sans paramètres
    }

    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    public Livre(String unAuteur, String unTitre, int n) {
        auteur = unAuteur;
        titre = unTitre;
        nbPages = n;
    }

   

    // Méthode afficheToi() pour afficher une description du livre
    public void afficheToi() {
        System.out.println(toString());
    }

    // Méthode toString() pour renvoyer une description du livre sous forme de chaîne de caractères
    @Override
    public String toString() {
        return "Livre : " + titre + " par " + auteur + ", " + nbPages + " pages";
    }

    // Méthode main pour tester la classe Livre
    public static void main(String[] args) {
        Livre livre1 = new Livre(); // Création d'un livre sans paramètres
        Livre livre2 = new Livre("Auteur1", "Titre1"); // Création d'un livre avec auteur et titre
        Livre livre3 = new Livre("Auteur2", "Titre2", 300); // Création d'un livre avec auteur, titre et nombre de pages

        // Affichage des livres
        System.out.println("Livre 1 : ");
        livre1.afficheToi();
        System.out.println("Livre 2 : ");
        livre2.afficheToi();
        System.out.println("Livre 3 : ");
        livre3.afficheToi();
    }
}
