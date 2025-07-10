package hu.jaro.peter.parking;


/**
 * 7. Hozzuk létre a TeherGepjarmu osztályt, amely öröklődjön a Gepjarmu osztályból.
 * Mezői: - aktualisSuly - a tehergépjármű súlya (kg, egész szám)
 * - tengelyszam - hány tengellyel rendelkezik a gépjármű (egész szám)
  * 8. Írjuk felül a TeherGepjarmu osztály toString metódusát úgy, hogy a plusz mezők is megjelenjenek.
 * 10. A Tehergepjarmu osztály implementálja a TeherGepjarmuInterface-t.
 * * - tengelyTerheles() - a függvény visszatér az egy tengelyre eső aktuális terheléssel (lebegőpontos érték)
 */
public class TeherGepjarmu extends Gepjarmu implements TeherGepjarmuInterface{

    private int aktualisSuly;
    private int tengelyszam;

    public TeherGepjarmu(String rendszam, CarType tipus, int beparkolOra, int beparkolPerc,int aktualisSuly,int tengelyszam) {
        super(rendszam, tipus, beparkolOra, beparkolPerc);
        this.aktualisSuly=aktualisSuly;
        this.tengelyszam=tengelyszam;
    }

    @Override
    public double tengelyTerheles() {
        return  (double) aktualisSuly/tengelyszam;
    }

    @Override
    public String toString() {
        return "TeherGepjarmu{" +
                "aktualisSuly=" + aktualisSuly +
                ", tengelyszam=" + tengelyszam +
                '}';
    }

    public int getAktualisSuly(){
        return this.aktualisSuly;
    }
    public int getTengelyszam(){
        return this.tengelyszam;
    }
     
}
