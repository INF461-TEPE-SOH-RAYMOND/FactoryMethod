import fabrique.FabriqueProduit;
import produit.Produit;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello world !");

        FabriqueProduit fabrique = new FabriqueProduit();
        Produit produit = null;

        produit = fabrique.createProduit(fabrique.TYPEA);
        produit.methodeProduit();

        produit = fabrique.createProduit(fabrique.TYPEB);
        produit.methodeProduit();

        produit = fabrique.createProduit(fabrique.TYPEC);
        produit.methodeProduit();

        produit = fabrique.createProduit(fabrique.TYPED);
        produit.methodeProduit();

        produit = fabrique.createProduit("E");
        
    }
}
