package hu.jaro.peter.bucket.list;

import java.util.Objects;

/*1. Hozzon létre egy osztályt BakancsListaElem néven, az alábbi mezőkkel:
   
   nev (szöveges): az elem megnevezése
   
   ev (egész szám): A kipróbálás éve. Ha az értéke kisebb vagy egyenlő, mint nulla, akkor az adott elem még nem volt kipróbálva.
   
   koltseg (egész szám): Az adott bakancslista elem teljes bekerülési költsége, forintban.
   A név mező kívülről ne legyen írható, csak olvasható és a konstruktorban kapjon értéket (azaz csak getter metódusa legyen)!
    A többi mező legyen írható és olvasható, tehát legyen getter és setter metódusuk is!
   Két elem akkor legyen egyenlő, ha nevük megegyezik!
   Írja felül a toString metódust úgy, hogy a generált szöveg tartalmazza az elem nevét, azt, hogy ki volt-e már próbálva
   (ha igen, akkor a kipróbálás évét is) és hogy mennyibe kerül.
**/
public class BakancsListaElem {

    private String nev;
    private int ev;
    private int koltseg;

    public BakancsListaElem(String nev, int ev, int koltseg) {
        this.nev = nev;
        this.ev = ev;
        this.koltseg = koltseg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BakancsListaElem that = (BakancsListaElem) o;
        return nev.equals(that.nev);
    }

    /**
     * @return Írja felül a toString metódust úgy, hogy a generált szöveg tartalmazza az elem nevét,
     * azt, hogy ki volt-e már próbálva
     * (ha igen, akkor a kipróbálás évét is) és hogy mennyibe kerül.
     */
    @Override
    public String toString() {
        String kiir = " ";
        kiir = kiir + this.nev + " ";
        if (this.ev > 0) {
            kiir += "igen " + this.ev + " " + this.koltseg+ " \n";
        } else kiir += "nem \n";


        return kiir;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev);
    }

    public String getNev() {
        return nev;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getKoltseg() {
        return koltseg;
    }

    public void setKoltseg(int koltseg) {
        this.koltseg = koltseg;
    }
}
