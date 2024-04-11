public class Livre {
    
    private String titre, auteur;
    private int nbPages;
    private double prix; // Ajout de la variable prix
    private boolean prixFixe = false; // Variable pour indiquer si le prix a été fixé

   
    public Livre() {
        
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

    public Livre(String unAuteur, String unTitre, int n, double p) {
        auteur = unAuteur;
        titre = unTitre;
        nbPages = n;
        setPrix(p); // Appel de la méthode setPrix pour fixer le prix
    }

  

    // Méthode afficheToi() pour afficher une description du livre
    public void afficheToi() {
        System.out.println(toString());
    }

    // Méthode toString() pour renvoyer une description du livre sous forme de chaîne de caractères
    
    public String toString() {
        if (prixFixe) {
            return "Livre : " + titre + " par " + auteur + ", " + nbPages + " pages, Prix : " + prix + " euros";
        } else {
            return "Livre : " + titre + " par " + auteur + ", " + nbPages + " pages, Prix pas encore fixé";
        }
    }

    // Méthode setPrix() pour modifier le prix du livre
    public void setPrix(double p) {
        if (!prixFixe) {
            prix = p;
            prixFixe = true; // Marquer le prix comme fixé
        } else {
            System.out.println("Erreur : Le prix a déjà été fixé et ne peut pas être modifié.");
        }
    }

    
    public static void main(String[] args) {
        Livre livre1 = new Livre(); // Création d'un livre sans paramètres
        Livre livre2 = new Livre("Auteur1", "Titre1"); // Création d'un livre avec auteur et titre
        Livre livre3 = new Livre("Auteur2", "Titre2", 300); // Création d'un livre avec auteur, titre et nombre de pages
        Livre livre4 = new Livre("Auteur3", "Titre3", 250, 20.50); // Création d'un livre avec auteur, titre, nombre de pages et prix

       
        System.out.println("Livre 1 : ");
        livre1.afficheToi();
        System.out.println("Livre 2 : ");
        livre2.afficheToi();
        System.out.println("Livre 3 : ");
        livre3.afficheToi();
        System.out.println("Livre 4 : ");
        livre4.afficheToi();

        // Essai de modification du prix du livre4
        livre4.setPrix(30.00);
    }
}
