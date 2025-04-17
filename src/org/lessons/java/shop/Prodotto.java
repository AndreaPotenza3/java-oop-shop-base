package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto() {
        this.codice = 0;
        this.nome = "Nessun nome";
        this.descrizione = "Nessuna descrizione";
        this.prezzo = null;
        this.iva = null;
    }

    public int getCodice() {

        return this.codice;
    }

    public String getNome() {
        if (nome != null) {

            return this.nome;

        }
        return null;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getDescrizione() {
        if (descrizione != null) {

            return this.descrizione;

        }
        return null;
    }

    public void setDescrizione(String descrizione) {
        if(descrizione != null) {
            this.descrizione = descrizione
        }
    }

    public BigDecimal getPrezzoBase() {
        if (prezzo != null) {

            return this.prezzo;

        }
        return null;
    }

    public void setPrezzoBase(BigDecimal prezzo) {
        if (prezzo != null && prezzo.compareTo(BigDecimal.ZERO) >= 0) {
            this.prezzo = prezzo;
        }

    }

    public BigDecimal getIva() {
        if (iva != null && iva.compareTo(BigDecimal.ZERO) >= 0) {

            return this.iva;

        }
        return null;
    }

    public void setIva() {

    }

    public BigDecimal getPrezzoIvato() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva).setScale(2, RoundingMode.DOWN));
        }
        return null;
    }

    public String getNomeEsteso() {
        if (nome != null) {

            return codice + "-" + nome;
        }
        return null;
    }
}
