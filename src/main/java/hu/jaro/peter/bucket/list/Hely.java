package hu.jaro.peter.bucket.list;

/**
 * 2. Származtasson le három osztályt a zh.BakancsListaElem osztályból!
 *   Etterem. Mezők: cim (szöveges), telefonszam (szöveges)
 *  Hely. Mezők: ország (szöveges), város (szöveges).
 *  Konyv. Mezők: szerzo (szöveges).
 * Valamennyi mező csak olvasható legyen és a konstruktorban kapjon értéket!
 * Írja felül a toString metódusokat úgy, hogy a generált szövegek a korábbiak mellett az új mezők értékét is tartalmazzák!
 */
public class Hely extends BakancsListaElem{

    private final String orszag;
    private final String varos;

    public Hely(String nev, int ev, int koltseg, String orszag, String varos) {
        super(nev, ev, koltseg);
        this.orszag = orszag;
        this.varos = varos;
    }

    public String getOrszag() {
        return orszag;
    }

    public String getVaros() {
        return varos;
    }
    @Override
    public String toString() {
        return super.toString() + " Hely( " +
                "orszag: " + this.orszag +
                ", varos: " + this.varos +
                ")";
    }
}
