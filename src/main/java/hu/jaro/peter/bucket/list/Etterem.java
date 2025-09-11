package hu.jaro.peter.bucket.list;

/**
 * 2. Származtasson le három osztályt a zh.BakancsListaElem osztályból!
 *   Etterem. Mezők: cim (szöveges), telefonszam (szöveges)
 *  Hely. Mezők: ország (szöveges), város (szöveges).
 *  Konyv. Mezők: szerzo (szöveges).
 * Valamennyi mező csak olvasható legyen és a konstruktorban kapjon értéket!
 * Írja felül a toString metódusokat úgy, hogy a generált szövegek a korábbiak mellett az új mezők értékét is tartalmazzák!
 */
public class Etterem extends BakancsListaElem {

    private final String cim;

    private final String telefonszam;

    public Etterem(String nev, int ev, int koltseg, String cim, String telefonszam) {
        super(nev, ev, koltseg);
        this.cim = cim;
        this.telefonszam = telefonszam;
    }

    public String getCim() {
        return cim;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    @Override
    public String toString() {
        return super.toString() + " Etterem( " +
                "cim: " + this.cim +
                ", telefonszam: " + telefonszam +
                ")";
    }
}
