package org.lessons.java.shop;

public class Prodotto {

    public String nome;
    public String descrizione;
    public Double prezzo;
    public int iva;
    public int codice;
    
    public Prodotto(String nome, String descrizione, Double prezzo, int iva){
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = (int)(Math.random()*101);
    }
    // public void createCode(){
    //     this.codice = (int)(Math.random()*101);
    // }

    public void ivaPrice(){
        this.prezzo = prezzo + ((prezzo * iva)/100);
    }

    public void fullName(){
        this.nome = codice + "-" + nome;
    }
}

