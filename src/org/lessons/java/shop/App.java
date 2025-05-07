package org.lessons.java.shop;
public class App {
    public static void main(String[] args) throws Exception {
        
    Prodotto prodotto1 = new Prodotto("Cappuccino", 2.50, "cappuccino cacao");
    Prodotto prodotto2 = new Prodotto("Pizza", 8, "pizza 100INTEGRALE");
    System.out.println(prodotto2.getPrezzoTassato());
    System.out.println(prodotto1.getPrezzoTassato());
    
    }
    
}
