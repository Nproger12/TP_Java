/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nchare Timothee ADRIAN
 */
public class exercice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livre L = new Livre("Adres","Le sexe c'et bon",300,65646);
        Livre L2 = new Livre();
        Livre L3 = new Livre("Adres","Le sexe c'et bon",300,87965);
        L2.setNbPages(300);
        System.out.println(L);
        System.out.println(L2);
        System.out.println(L3);
        L3.SetPrix(0);
        L2.SetPrix(0);
        System.out.println(L2);
        System.out.println(L3);
    }
    
}
