import org.lessons.java.shop.Prodotto;

public class App {
    public static void main(String[] args) throws Exception {
        
    Prodotto prodotto1 = new Prodotto("Cappuccino", 2.50);
    Prodotto prodotto2 = new Prodotto("Pizza", 8);
    

    System.out.println(prodotto1.getPrezzo());
    System.out.println(prodotto1.getNomeLungo());
    System.out.println(prodotto1.getPrezzoTassato());

    System.out.println(prodotto2.getPrezzo());
    System.out.println(prodotto2.getNomeLungo());
    System.out.println(prodotto2.getPrezzoTassato());
    
    }
}
