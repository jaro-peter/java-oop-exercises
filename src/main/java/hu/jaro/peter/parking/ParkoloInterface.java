package hu.jaro.peter.parking;

/**
 * 13. Hozzuk létre a ParkoloInterface-t, amely a következő függvényleírást tartalmazza:
 * - parkol(Gepjarmu erkezo, int ora, int perc) – ha létezik, akkor az első szabad parkolóhelyre
 * beparkolja a gépjárművet és beállítja a parkolás kezdetének időpontját.
 * Parkolás csak 8.00 - 18.00 között lehetséges a parkolóban, ezen kívüli időpontban
 * ne engedje parkolni a gépjárművet! Ha a gépjármű a TeherGepjarmu osztály példánya
 * (használd az instanceof operátort), akkor ebben az esetben csak olyan gépjármű parkolhat a parkolóban,
 * melynek tengelyterhelése kevesebb, mint 1000 kg. Ha egy gépjárművet nem lehet valamilyen oknál fogva leparkoltatni
 * a parkolóban, akkor annak okáról a képernyőn jelenjen meg egy üzenet.
 * Ne felejtsd a foglalt mező értékét eggyel növelni.
 * - parkoloHely(Gepjarmu gepj) - visszatér az adott gépjármű tömb indexével,
 * ha a gépjármű a parkolóban parkol, különben -1-et ad vissza
 * - kiparkolas(Gepjarmu gepj, int ora, int perc) - a gépkocsi elhagyja a parkolót.
 * Kiparkolás csak 8.00 - 18.00 között lehetséges a parkolóból. A kiparkolás idejének későbbre kell esnie,
 * mint a beparkolásé. Minden kocsi elhagyja a parkolót a nap végén, így napváltást nem kell kezelni.
 * A nem megfelelő időpontról, vagy a nem létező gépjárműről a program adjon visszajelzést a képernyőre.
 * A program vegye ki a tömbből az adott gépjárművet és számítsa ki a fizetendő díjat az alábbiak szerint:
 * - minden megkezdett 60 perc teljes órának számít
 * - a gépjárművek közül a hibrid 20%-os az elektromos 50%-os engedményben részesül
 * <p>
 * A tarifa személygépjárművek esetén kategória szerint a következő:
 * - 1 kategória: 300 Ft/óra
 * - 2 kategória: 500 Ft/óra
 * - 3 kategória: 1000 Ft/óra
 * - 4 kategória: 2000 Ft/óra
 * - tehergépjárművek esetén - 5000 Ft/óra
 * A kapott értékkel növeli a bevetel mező értékét. Ne felejtsd el a foglalt mező értékét eggyel csökkenteni.
 */
public interface ParkoloInterface {

    void parkol(Gepjarmu erkezo, int ora, int perc);

    int parkoloHely(Gepjarmu gepj);

    void kiparkolas(Gepjarmu gepj, int ora, int perc);

}
