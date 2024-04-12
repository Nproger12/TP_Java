/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nchare Timothee ADRIAN
 */
public class exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livre L1 = new Livre("Adrian","Au dela du monde");
        Livre L2 = new Livre("Adres","Au dela de l'espace");
        System.out.println("L'auteur de "+L1.getTitre()+" est "+L1.getAuteur());
        System.out.println("L'auteur de "+L2.getTitre()+" est "+L2.getAuteur());
    }
    
}
