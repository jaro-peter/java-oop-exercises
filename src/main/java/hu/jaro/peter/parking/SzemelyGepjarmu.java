package hu.jaro.peter.parking;


/**
 * Hozzuk létre a SzemelyGepjarmu osztályt, ami öröklődjön a Gepjarmu osztályból,
 * és a következő mezőt tartalmazza:
 * - szemelyekSzama - a gépjárművel maximálisan szállítható személyek száma
 * Hozzunk létre a szükséges konstruktorokat, illetve gondoskodjunk az osztály lezárásáról is.
 *
 * 5. A SzemelyGepjarmu osztály implementálja a SzemelyGepjarmuInterface-t.
 * 1 - ha a szállítható személyek száma kisebb vagy egyenlő mint 2
 * 2 - ha a szállítható személyek száma több mint 2 és kisebb vagy egyenlő mint 5
 * 3 - ha a szállítható személyek száma több mint 5 és kisebb vagy egyenlő mint 10
 * 4 - ha a szállítható személyek száma több mint 10
 *6. Írjuk felül a SzemelyGepjarmu osztály toString metódusát úgy, hogy a plusz mező és a kategória is megjelenjen.*/
public class SzemelyGepjarmu extends Gepjarmu implements SzemelyGepjarmuInterface{

    private int szemelyekSzama;


    public SzemelyGepjarmu(String rendszam, Cartype tipus, int beparkolOra, int beparkolPerc, int szemelyekSzama) {
        super(rendszam, tipus, beparkolOra, beparkolPerc);
        this.szemelyekSzama = szemelyekSzama;
    }

    public void setSzemelyekSzama(int szemelyekSzama){
        this.szemelyekSzama= szemelyekSzama;
    }
    public int getSzemelyekSzama(){
        return szemelyekSzama;
    }


    @Override
    public int kategoria() {
         if (szemelyekSzama<=2){return 1;}
         else if (szemelyekSzama>2 && szemelyekSzama<=5){return 2;}
         else if (szemelyekSzama>5 && szemelyekSzama<=10 ){return 3;}
         else  {return 4;}
    }

}
