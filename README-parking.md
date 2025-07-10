
# Nyíregyházi Egyetem Programozás 2. ZH 2023. 04. 11.
## Hozzunk létre egy alkalmazást, amely egy fizetős parkoló adatait kezeli.
### 1. Hozzuk létre a Gepjarmu osztályt a következő mezőkkel: - rendszam - szöveges típusú


* **tipus - CarType felsorolásos elem**
* **beparkolOra - egész szám, a parkolás kezdetének óráját jelöli**
* **beparkolPerc - egész szám, a parkolás kezdetének percét jelöli**


#### A CarType egy felsorolásos típus a következő konstansokkal:
* **BENZIN, GÁZOLJA, HIBRID, ELEKTROMOS**
Hozzunk létre a megfelelő konstruktorokat, illetve gondoskodjunk az osztály lezárásáról is.
2. Írjuk felül a Gepjarmu osztály toString és equals metódusát. 
Két gépjármű akkor legyen megegyező, ha a rendszámuk megegyezik.
3. Hozzuk létre a SzemelyGepjarmu osztályt,
ami öröklődjön a Gepjarmu osztályból, és a következő mezőt tartalmazza:
- szemelyekSzama - a gépjárművel maximálisan szállítható személyek száma


Hozzunk létre a szükséges konstruktorokat, illetve gondoskodjunk az osztály lezárásáról is.
4. Hozzuk létre a SzemelyGepjarmuInterface-t, amely a következő függvényleírást tartalmazza:
4. - kategoria() - a függvény a következő (egész szám) visszatérési értékekkel térhet vissza:


1 - ha a szállítható személyek száma kisebb vagy egyenlő mint 2
2 - ha a szállítható személyek száma több mint 2 és kisebb vagy egyenlő mint 5
3 - ha a szállítható személyek száma több mint 5 és kisebb vagy egyenlő mint 10
4 - ha a szállítható személyek száma több mint 10
5. A SzemelyGepjarmu osztály implementálja a SzemelyGepjarmuInterface-t.
6. Írjuk felül a SzemelyGepjarmu osztály toString metódusát úgy, hogy a plusz mező és a kategória is megjelenjen.
7. Hozzuk létre a TeherGepjarmu osztályt, amely öröklődjön a Gepjarmu osztályból. 
8. Mezői: - aktualisSuly - a tehergépjármű súlya (kg, egész szám)
- tengelyszam - hány tengellyel rendelkezik a gépjármű (egész szám)

8. Írjuk felül a TeherGepjarmu osztály toString metódusát úgy, hogy a plusz mezők is megjelenjenek.
9. Hozzuk létre a TeherGepjarmuInterface-t, amely a következő függvényleírást tartalmazza: - tengelyTerheles()
9. - a függvény visszatér az egy tengelyre eső aktuális terheléssel (lebegőpontos érték)

10. A Tehergepjarmu osztály implementálja a TeherGepjarmuInterface-t.
11. Hozzuk létre a Parkolo osztályt a következő mezőkkel:


- osszesParkolo - egész szám, amely az összes rendelkezésre álló parkolók számát adja meg
- foglalt - megadja, hogy hány parkoló foglalt a parkolóban
- parkolo - egy tömb, amely Gepjarmu osztályba tartozó elemeket tud tárolni, összesen osszesParkolo mennyiségben
- bevetel - a parkolásból származó bevételt tárolja


Készítsük el a megfelelő konstruktorokat és gondoskodjunk az osztály lezárásáról.
12. Írjuk felül a Parkolo osztály toString metódusát úgy, hogy az összes adatot 
13. a parkoló autókkal együtt megjelenítse. Ha egy adott parkolóhely üres, akkor ott az „Üres” felirat jelenjen meg.
13. Hozzuk létre a ParkoloInterface-t, amely a következő függvényleírást tartalmazza: 
13. - parkol(Gepjarmu erkezo, int ora, int perc) – ha létezik, akkor az első szabad parkolóhelyre
- beparkolja a gépjárművet és beállítja a parkolás kezdetének időpontját. Parkolás csak 8.00 - 18.00 
- között lehetséges a parkolóban, ezen kívüli időpontban ne engedje parkolni a gépjárművet! 
- Ha a gépjármű a TeherGepjarmu osztály példánya (használd az instanceof operátort),
- akkor ebben az esetben csak olyan gépjármű parkolhat a parkolóban, 
- melynek tengelyterhelése kevesebb, mint 1000 kg.
- Ha egy gépjárművet nem lehet valamilyen oknál fogva leparkoltatni a parkolóban, 
- akkor annak okáról a képernyőn jelenjen meg egy üzenet. Ne felejtsd a foglalt mező értékét eggyel növelni.
- parkoloHely(Gepjarmu gepj) - visszatér az adott gépjármű tömb indexével, ha a gépjármű a parkolóban parkol, különben -1-et ad vissza
- kiparkolas(Gepjarmu gepj, int ora, int perc) - a gépkocsi elhagyja a parkolót. Kiparkolás csak 8.00 - 18.00 között lehetséges a parkolóból. A kiparkolás idejének későbbre kell esnie, mint a beparkolásé. Minden kocsi elhagyja a parkolót a nap végén, így napváltást nem kell kezelni. A nem megfelelő időpontról, vagy a nem létező gépjárműről a program adjon visszajelzést a képernyőre. A program vegye ki a tömbből az adott gépjárművet és számítsa ki a fizetendő díjat az alábbiak szerint:
- minden megkezdett 60 perc teljes órának számít
- a gépjárművek közül a hibrid 20%-os az elektromos 50%-os engedményben részesül


A tarifa személygépjárművek esetén kategória szerint a következő:
- 1 kategória: 300 Ft/óra
- 2 kategória: 500 Ft/óra
- 3 kategória: 1000 Ft/óra
- 4 kategória: 2000 Ft/óra
- tehergépjárművek esetén - 5000 Ft/óra
  A kapott értékkel növeli a bevetel mező értékét. Ne felejtsd el a foglalt mező értékét eggyel csökkenteni.
14. Implementáljuk a ParkoloInterface-t a Parkoló osztályon!
15. Mellékelve van a ParkoloUzemelteto osztály. Futtasd le ezt az osztályt a benne található adatokkal.
16. Az elkészített megoldáshoz tartozó java kiterjesztésű állományokat küldd el e-mail-ben a következő címekre:
17. attila_piros@epam.com, barna_iszaly@epam.com, vegera.jozsef@nye.hu 

