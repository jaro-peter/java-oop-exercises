# java-oop-exercises

* Java Programozási Feladat: BankAccount Osztály Hierarchia
Feladat leírása:
Készíts egy osztályhierarchiát, amely egy egyszerű bankszámla rendszert modellez!
A rendszer alapja egy absztrakt osztály, amelyet két konkrét számlatípus valósít meg:
egy normál bankszámla és egy utazási célokra használt speciális számla.
1. Osztályok és öröklődés
   •	Hozz létre egy BankAccount nevű absztrakt osztályt, amely tartalmazza a következőket:
   o	Egy összeg (balance) adattagot, amely a számla aktuális egyenlegét tárolja.
   o	Két absztrakt metódust:
   	transferTo(BankAccount other, double amount): pénz átutalása egy másik számlára.
   	payWithCard(double amount): bankkártyás fizetés kezelése.
   •	Készíts két leszármazott osztályt:
   o	NormalAccount – egy szokványos számlatípus.
   o	TravelAccount – utazáshoz kapcsolódó számla, amely például más jutalékkal működhet.
2. Működésbeli különbségek
   A különböző számlatípusok eltérően valósítják meg az alábbi műveleteket:
   •	Transfer (utalás):
   o	NormalAccount esetén az utalt összegből 2% jutalékot vonjon le a küldő számláról,
   és a maradék érkezzen meg a fogadó számlára.
   o	TravelAccount esetén az utalás fix 5 egység díjjal történik, amit a küldő számláról von le.
   •	Bankkártyás fizetés (payWithCard):
   o	NormalAccount esetén a fizetésnél 0% kezelési költség adódik az összeghez.
   o	TravelAccount esetén a bankkártyás fizetés devizakonverzióval együtt 3% extra költséget jelent.
3. További elvárások
   •	Az összes művelet során biztosítsd, hogy a számlaegyenleg ne mehessen negatívba.
   Ha nincs elég pénz, ne hajtsuk végre a műveletet.
   •	Írj részletes toString() metódust, amely visszaadja a számla típusát és aktuális egyenlegét.
   •	A BankAccount osztályban valósíts meg egy getBalance() metódust, amellyel lekérdezhető az egyenleg.
4. Példahasználat (nem kell implementálni)
   BankAccount acc1 = new NormalAccount(1000);
   BankAccount acc2 = new TravelAccount(500);

acc1.transferTo(acc2, 200); // várható: acc1 egyenlege csökken 204-gyel (2% jutalék), acc2 nő 200-zal
acc2.payWithCard(100); // várható: levonás 103 egység
