package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Prodotto iphone = new Prodotto("iphone 6", "Smartphone di ultima generazione", new BigDecimal(599),
                new BigDecimal(0.22));

        iphone.setNome("carlo");

        System.out.println(iphone.getPrezzoBase());
        System.out.println(iphone.getPrezzoIvato());
        System.out.println(iphone.getNomeEsteso());
        System.out.println(iphone.getNome());

        Prodotto iphone2 = new Prodotto();

        System.out.println(iphone2.getNome());
        

    }

}
