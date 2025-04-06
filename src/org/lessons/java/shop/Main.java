package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        
        
        Prodotto iphone = new Prodotto("iphone 6", "Smartphone di ultima generazione", new BigDecimal(100), new BigDecimal(0.22));

    
        // iphone.codice = (int)(Math.random()*101);
        // iphone.nome= "iphone 6";
        // iphone.descrizione="Smartphone di ultima generazione";
        // iphone.prezzo= 599.99;
        // iphone.iva=22;
        
        System.out.println(iphone.getPrezzoBase());
        System.out.println(iphone.getPrezzoIvato());
        System.out.println(iphone.getNomeEsteso());
        

    }
    
}
