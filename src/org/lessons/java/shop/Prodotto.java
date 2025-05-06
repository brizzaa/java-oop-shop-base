package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {

    Random random = new Random();
    public int codiceProdotto;

    public String nomeProdotto;
    public String descrizioneProdotto; 
    
    public double prezzoProdotto;
    public int ivaProdotto = 22;


    public Prodotto(String nome, double prezzo, String descrizione){ 
        this.codiceProdotto = Math.abs(random.nextInt(100000));   
        this.descrizioneProdotto = descrizione;
        this.nomeProdotto = nome;
        this.prezzoProdotto = prezzo; 
    }



     
    public double getPrezzo(){
        return this.prezzoProdotto;
    }




     public double getPrezzoTassato(){
        return this.prezzoProdotto + ((this.prezzoProdotto / 100) * this.ivaProdotto);
    }
    

    public String getNomeLungo(){
        return this.codiceProdotto + "-" + this.nomeProdotto; // come funziona il parsing?
    }
    
}
