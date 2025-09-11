package hu.jaro.peter.bucket.list;

/**
 * Származtasson le három osztályt a zh.BakancsListaElem osztályból!
 * Etterem. Mezők: cim (szöveges), telefonszam (szöveges)
 * Hely. Mezők: ország (szöveges), város (szöveges).
 * Konyv. Mezők: szerzo (szöveges).
 * Valamennyi mező csak olvasható legyen és a konstruktorban kapjon értéket!
 * Írja felül a toString metódusokat úgy, hogy a generált szövegek a korábbiak mellett az új mezők értékét is tartalmazzák!
 */
public class Konyv extends BakancsListaElem {

    private String szerzo;

    public Konyv(String nev, int ev, int koltseg, String szerzo) {
        super(nev,ev,koltseg);
        this.szerzo = szerzo;
    }

    @Override
    public String toString(){
        return super.toString()+ " "+ this.szerzo;
    }
    public String getSzerzo(){
        return this.szerzo;
    }

}
