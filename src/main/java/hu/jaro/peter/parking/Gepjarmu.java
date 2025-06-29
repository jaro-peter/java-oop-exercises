package hu.jaro.peter.parking;

import java.util.Objects;

/**
 * 1. Hozzuk létre a Gepjarmu osztályt a következő mezőkkel: - rendszam - szöveges típusú
 * tipus - CarType felsorolásos elem
 * beparkolOra - egész szám, a parkolás kezdetének óráját jelöli
 * beparkolPerc - egész szám, a parkolás kezdetének percét jelöli
 * Írjuk felül a Gepjarmu osztály toString és equals metódusát.
 * Két gépjármű akkor legyen megegyező, ha a rendszámuk megegyezik.
 */
public class Gepjarmu {

    private String rendszam;

    private Cartype tipus;
    private int beparkolOra;
    private int beparkolPerc;

    enum Cartype {BENZIN, GAZOLJA, HIBRID, ELEKTROMOS}

    ;


    public Gepjarmu(String rendszam, Cartype tipus, int beparkolOra, int beparkolPerc) {
        this.rendszam = rendszam;
        this.tipus = tipus;
        this.beparkolOra = beparkolOra;
        this.beparkolPerc = beparkolPerc;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Gepjarmu gepjarmu = (Gepjarmu) obj;
        return rendszam.equals(gepjarmu.rendszam);
    }













    @Override
    public int hashCode() {
        return rendszam.hashCode();
    }

}
