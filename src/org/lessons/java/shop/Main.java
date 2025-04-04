package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        
        
        Prodotto iphone = new Prodotto("iphone 6", "Smartphone di ultima generazione", 599.99, 22);

    
        // iphone.codice = (int)(Math.random()*101);
        // iphone.nome= "iphone 6";
        // iphone.descrizione="Smartphone di ultima generazione";
        // iphone.prezzo= 599.99;
        // iphone.iva=22;
        System.out.println(iphone.codice);

        iphone.ivaPrice();
        System.out.println(iphone.prezzo);
        iphone.fullName();
        System.out.println(iphone.nome);

    }
    
}
