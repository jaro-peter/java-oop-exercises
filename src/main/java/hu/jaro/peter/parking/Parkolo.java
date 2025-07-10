package hu.jaro.peter.parking;

import java.util.Arrays;

/**
 * 11. Hozzuk létre a Parkolo osztályt a következő mezőkkel:
 * - osszesParkolo - egész szám, amely az összes rendelkezésre álló parkolók számát adja meg
 * - foglalt - megadja, hogy hány parkoló foglalt a parkolóban
 * - parkolo - egy tömb, amely Gepjarmu osztályba tartozó elemeket tud tárolni, összesen osszesParkolo mennyiségben
 * - bevetel - a parkolásból származó bevételt tárolja
 * Készítsük el a megfelelő konstruktorokat és gondoskodjunk az osztály lezárásáról.
 * <p>
 * 12. Írjuk felül a Parkolo osztály toString metódusát úgy,
 * -----hogy az összes adatot a parkoló autókkal együtt megjelenítse.
 * -----Ha egy adott parkolóhely üres, akkor ott az „Üres” felirat jelenjen meg.
 * 14. Implementáljuk a ParkoloInterface-t a Parkoló osztályon!
 * <p>
 * <p>
 * 13. Hozzuk létre a ParkoloInterface-t, amely a következő függvényleírást tartalmazza:
 * - parkol(Gepjarmu erkezo, int ora, int perc) – ha létezik, akkor az első szabad parkolóhelyre beparkolja
 * -----a gépjárművet és beállítja a parkolás kezdetének időpontját. Parkolás csak 8.00 - 18.00 között lehetséges
 * -----a parkolóban, ezen kívüli időpontban ne engedje parkolni a gépjárművet! Ha a gépjármű a TeherGepjarmu osztály
 * -----példánya (használd az instanceof operátort), akkor ebben az esetben csak olyan gépjármű parkolhat a parkolóban,
 * -----melynek tengelyterhelése kevesebb, mint 1000 kg. Ha egy gépjárművet nem lehet valamilyen oknál fogva leparkoltatni
 * -----a parkolóban, akkor annak okáról a képernyőn jelenjen meg egy üzenet. Ne felejtsd a foglalt mező értékét eggyel növelni.
 * <p>
 * - parkoloHely(Gepjarmu gepj) - visszatér az adott gépjármű tömb indexével, ha a gépjármű a parkolóban parkol,
 * -----különben -1-et ad vissza
 * <p>
 * - kiparkolas(Gepjarmu gepj, int ora, int perc) - a gépkocsi elhagyja a parkolót. Kiparkolás
 * -----csak 8.00 - 18.00 között lehetséges a parkolóból. A kiparkolás idejének későbbre kell esnie,
 * ----- mint a beparkolásé. Minden kocsi elhagyja a parkolót a nap végén, így napváltást nem kell kezelni.
 * -----A nem megfelelő időpontról, vagy a nem létező gépjárműről a program adjon visszajelzést a képernyőre.
 * -----A program vegye ki a tömbből az adott gépjárművet és számítsa ki a fizetendő díjat az alábbiak szerint:
 * -----minden megkezdett 60 perc teljes órának számít
 * -----a gépjárművek közül a hibrid 20%-os az elektromos 50%-os engedményben részesül
 * <p>
 * <p>
 * A tarifa személygépjárművek esetén kategória szerint a következő:
 * - 1 kategória: 300 Ft/óra
 * - 2 kategória: 500 Ft/óra
 * - 3 kategória: 1000 Ft/óra
 * - 4 kategória: 2000 Ft/óra
 * - tehergépjárművek esetén - 5000 Ft/óra
 * A kapott értékkel növeli a bevetel mező értékét. Ne felejtsd el a foglalt mező értékét eggyel csökkenteni.
 */
public class Parkolo implements ParkoloInterface {
    private int osszesParkolo;
    private int foglalt;
    private Gepjarmu[] parkolo;
    private int bevetel;

    public Parkolo(int osszesParkolo) {
        this.osszesParkolo = osszesParkolo;
        this.foglalt = 0;
        this.parkolo = new Gepjarmu[osszesParkolo];
        this.bevetel = 0;
    }

    public Parkolo(int osszesParkolo, int foglalt, Gepjarmu[] parkolo, int bevetel) {
        this.osszesParkolo = osszesParkolo;
        this.foglalt = foglalt;
        this.parkolo = parkolo;
        this.bevetel = bevetel;
    }

    /* * - parkol(Gepjarmu erkezo, int ora, int perc) – ha létezik, akkor az első szabad parkolóhelyre beparkolja
     * -----a gépjárművet és beállítja a parkolás kezdetének időpontját. Parkolás csak 8.00 - 18.00 között lehetséges
     * -----a parkolóban, ezen kívüli időpontban ne engedje parkolni a gépjárművet! Ha a gépjármű a TeherGepjarmu osztály
     * -----példánya (használd az instanceof operátort), akkor ebben az esetben csak olyan gépjármű parkolhat a parkolóban,
     * -----melynek tengelyterhelése kevesebb, mint 1000 kg. Ha egy gépjárművet nem lehet valamilyen oknál fogva leparkoltatni
     * -----a parkolóban, akkor annak okáról a képernyőn jelenjen meg egy üzenet. Ne felejtsd a foglalt mező értékét eggyel növelni.
     **/

    @Override
    public void parkol(Gepjarmu erkezo, int ora, int perc) {
        if (erkezo instanceof TeherGepjarmu){
            if (((TeherGepjarmu)erkezo).tengelyTerheles()>=1000){
                System.out.println("túl nehéz");
                return;
            }
        }
        if (!(ora >= 8 && ora < 18 && perc >= 0 && perc <= 59)){
            System.out.println("sajnos roszkor erkeztél");
            return;
        }
        if (foglalt >= osszesParkolo) {
            System.out.println("nincs hely");
            return;
        }
        for (int i = 0; i < osszesParkolo; i++) {
            if (parkolo[i] == null) {
                parkolo[i] = erkezo;
                foglalt++;
                erkezo.setBeparkolOra(ora);
                erkezo.setBeparkolPerc(perc);
                return;
            }
        }
        System.out.println("ismeretlen hiba a parkol függvényben");
    }

    /**
     * - parkoloHely(Gepjarmu gepj) - visszatér az adott gépjármű tömb indexével, ha a gépjármű a parkolóban parkol,
     * -----különben -1-et ad vissza
     */
    @Override
    public int parkoloHely(Gepjarmu gepj) {

        for (int i = 0; i < osszesParkolo; i++) {
            if ( gepj.equals(parkolo[i])){
                return i;
            }
        }
        return -1;
    }

    /* - kiparkolas(Gepjarmu gepj, int ora, int perc) - a gépkocsi elhagyja a parkolót. Kiparkolás
     * -----csak 8.00 - 18.00 között lehetséges a parkolóból. A kiparkolás idejének későbbre kell esnie,
     *----- mint a beparkolásé. Minden kocsi elhagyja a parkolót a nap végén, így napváltást nem kell kezelni.
     * -----A nem megfelelő időpontról, vagy a nem létező gépjárműről a program adjon visszajelzést a képernyőre.
     * -----A program vegye ki a tömbből az adott gépjárművet és számítsa ki a fizetendő díjat az alábbiak szerint:
     * -----minden megkezdett 60 perc teljes órának számít
     * -----a gépjárművek közül a hibrid 20%-os az elektromos 50%-os engedményben részesül
     */
    @Override
    public void kiparkolas(Gepjarmu gepj, int ora, int perc) {

        int index = parkoloHely(gepj);
        if (index == -1) {
            System.out.println("gepjarmű nincs a parkolóban");
            return;
        }

        if (perc < 0 || perc > 59) {
            System.out.println("helytelen idő formátum, NE VELEM SZÓRAKOZZ");
            return;
        }
        if (ora < 8 || ora > 17) {
            System.out.println("a parkoló zárva, nem mész innen sehová, se ki se be, itt nem jössz át, fussatok bolondok");
            return;
        }

        int parkolasiIdo = (ora * 60 + perc)-(parkolo[index].getBeparkolOra() * 60 + parkolo[index].getBeparkolPerc());
        if (parkolasiIdo <= 0) {
            System.out.println("A kiparkolás nem történhet hamarabb mint a beparkolás, valami gixer van");
            return;
        }
        int parkolasiOra = parkolasiIdo / 60 + 1;
        double kedvemeny = 1;
        if (parkolo[index].getTipus() == CarType.HIBRID) {
            kedvemeny = 0.8;
        }
        if (parkolo[index].getTipus() == CarType.ELEKTROMOS) {
            kedvemeny = 0.5;
        }

        if (parkolo[index] instanceof SzemelyGepjarmu) {
            int kategoria = ((SzemelyGepjarmu) parkolo[index]).kategoria();
            switch (kategoria) {
                case 1:
                    bevetel = bevetel + (int) ((parkolasiOra * 300) * kedvemeny);break;

                case 2:
                    bevetel = bevetel + (int) ((parkolasiOra * 500) * kedvemeny);break;

                case 3:
                    bevetel = bevetel + (int) ((parkolasiOra * 1000) * kedvemeny);break;

                case 4:
                    bevetel = bevetel + (int) ((parkolasiOra * 2000) * kedvemeny);break;
                default:
                    System.out.println("ismeretlen kategoria");

            }
        }
        if (parkolo[index] instanceof TeherGepjarmu) {
            bevetel = bevetel + (int) ((parkolasiOra * 5000) * kedvemeny);
        }
        foglalt--;
        parkolo[index]=null;
        
    }



    /* A tarifa személygépjárművek esetén kategória szerint a következő:
     * - 1 kategória: 300 Ft/óra
     * - 2 kategória: 500 Ft/óra
     * - 3 kategória: 1000 Ft/óra
     * - 4 kategória: 2000 Ft/óra
     * - tehergépjárművek esetén - 5000 Ft/óra
     * A kapott értékkel növeli a bevetel mező értékét. Ne felejtsd el a foglalt mező értékét eggyel csökkenteni.
     */

    @Override
    public String toString() {
        String telepHely = "";
        for (int i = 0; i < osszesParkolo; i++) {
            if (parkolo[i] != null) {
                telepHely = telepHely + (i+1)+ ".dik helyen: "+ parkolo[i].getRendszam()+" ,";
            } else telepHely = telepHely + "üres";

        }
        return "Parkolo{" +
                "osszesParkolo=" + osszesParkolo +
                ", foglalt=" + foglalt + "\n"+
                ", parkolo=" + telepHely +
                ", bevetel=" + bevetel +
                '}';
    }
}
