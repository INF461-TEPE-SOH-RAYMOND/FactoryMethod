import fabrique.FabriqueProduit;
import produit.Produit;

public class App {
    public static void main(String[] args) throws Exception {

        FabriqueProduit fabrique = new FabriqueProduit();
        Produit produit = null;

        produit = fabrique.createProduit(fabrique.TYPEA);
        produit.methodeProduit();

        produit = fabrique.createProduit(fabrique.TYPEB);
        produit.methodeProduit();

        produit = fabrique.createProduit(fabrique.TYPEC);
        produit.methodeProduit();

        produit = fabrique.createProduit("D");
        
    }
}
