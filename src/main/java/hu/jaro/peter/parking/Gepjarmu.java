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

    private CarType tipus;
    private int beparkolOra;
    private int beparkolPerc;



    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public CarType getTipus() {
        return tipus;
    }

    public void setTipus(CarType tipus) {
        this.tipus = tipus;
    }

    public int getBeparkolOra() {
        return beparkolOra;
    }

    public void setBeparkolOra(int beparkolOra) {
        this.beparkolOra = beparkolOra;
    }

    public int getBeparkolPerc() {
        return beparkolPerc;
    }

    public void setBeparkolPerc(int beparkolPerc) {
        this.beparkolPerc = beparkolPerc;
    }

    public Gepjarmu(String rendszam, CarType tipus, int beparkolOra, int beparkolPerc) {
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

    @Override
    public String toString(){
        return this.rendszam;
    }

}
