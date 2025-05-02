package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {
    
    Random random = new Random();
    public int codiceProdotto;
    public String nomeProdotto;
    public double prezzoProdotto;
    public double prezzoTassato;
    public int Iva = 22; 


    public Prodotto(String nome, double prezzo){
        // se volessi che si salvasse da qualche parte il numero senza generarlo ogni volta?
        
        this.codiceProdotto = Math.abs(random.nextInt(1000000)); // è giusto? 
        this.nomeProdotto = nome;
        this.prezzoProdotto = prezzo; 
        this.prezzoTassato = prezzo + ((prezzo / 100) * Iva);

    }


 
    public double getPrezzo(){
        return this.prezzoProdotto;
    }

    public double getPrezzoTassato(){
        return this.prezzoTassato;
    }
    

    public String getNomeLungo(){
        return this.codiceProdotto + "-" + this.nomeProdotto; // come funziona il parsing?
    }

    
}
