package fabrique;

import produit.Produit;
import produit.ProduitA;
import produit.ProduitB;
import produit.ProduitC;
import produit.ProduitD;

public class FabriqueProduit {
    public static final String TYPEA = "A";
    public static final String TYPEB = "B";
    public static final String TYPEC = "C";
    public static final String TYPED = "D";

    public Produit createProduit(String type){
        Produit produit = null;
        switch (type) {
            case TYPEA:
                produit = new ProduitA();
                break;
            case TYPEB:
                produit = new ProduitB();
                break;
            case TYPEC:
                produit = new ProduitC();
                break;
            case TYPED:
                produit = new ProduitD();
                break;
            default:
                System.out.println("Erreur le produit n'existe pas");
                break;
        }

        return produit;

    }
    
}
