/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nchare Timothee ADRIAN
 */
public class exercice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livre L1 = new Livre("Adrian","Au dela du monde",100);
        Livre L2 = new Livre("Adres","Au dela de l'espace",250);
        int Total = L1.getNbrePage()+L2.getNbrePage();
        System.out.println("L'auteur de "+L1.getTitre()+" est "+L1.getAuteur()+" Et son livre est constituer de "+L1.getNbrePage()+"pages");
        System.out.println("L'auteur de "+L2.getTitre()+" est "+L2.getAuteur()+" Et son livre est constituer de "+L2.getNbrePage()+"pages");
        System.out.println("\n le nombre de pages total est "+Total);
    }
    
}
