Nyíregyházi Egyetem
Programozás 2. ZH
2023. 05. 22.
1. Hozzon létre egy osztályt BakancsListaElem néven, az alábbi mezőkkel:
   
   nev (szöveges): az elem megnevezése
   
   ev (egész szám): A kipróbálás éve. Ha az értéke kisebb vagy egyenlő, mint nulla, akkor az adott elem még nem volt kipróbálva.
   
   koltseg (egész szám): Az adott bakancslista elem teljes bekerülési költsége, forintban.
   A név mező kívülről ne legyen írható, csak olvasható és a konstruktorban kapjon értéket (azaz csak getter metódusa legyen)! 
   A többi mező legyen írható és olvasható, tehát legyen getter és setter metódusuk is!
   Két elem akkor legyen egyenlő, ha nevük megegyezik!
   Írja felül a toString metódust úgy, hogy a generált szöveg tartalmazza az elem nevét, azt, hogy ki volt-e 
   már próbálva (ha igen, akkor a kipróbálás évét is) és hogy mennyibe kerül.
2. Származtasson le három osztályt a zh.BakancsListaElem osztályból!
   
   Etterem. Mezők: cim (szöveges), telefonszam (szöveges)
   
   Hely. Mezők: ország (szöveges), város (szöveges).
   
   Konyv. Mezők: szerzo (szöveges).
   Valamennyi mező csak olvasható legyen és a konstruktorban kapjon értéket!
   Írja felül a toString metódusokat úgy, hogy a generált szövegek a korábbiak mellett az új mezők értékét is tartalmazzák!
3. Hozzon létre egy BakancsLista osztályt, melynek mezői:
   
   megnevezes (szöveges)
   
   elemek (BakancsListaElem objektumok listája)
   A megnevezés legyen csak olvasható, a konstruktorban kapjon értéket!
   A lista az objektum létrehozásakor jöjjön létre, de később is legyen lehetőség az elemek megtekintésére 
   és a lista tartalmának módosítására, kívülről is!
4. A mellékelt bakancslista.txt szöveges file bakancslita elemeket tartalmaz, az alábbi formátumban:
   megnevezés,év,költség,[ÉTTEREM|HELY|KÖNYV],[cím,telefonszám|város,ország|szerző],költség,év
   A főprogramban hozzon létre egy BakancsLista objektumot és töltse fel a listát a file tartalmával!
5. Írjon metódusokat melyek az alábbi értékeket adják vissza:
   
   Melyik évben lett a legtöbb elem teljesítve.
   
   A legkorábban teljesített elem szöveges formában (az elem toString metódusát felhasználva). 
   Ha több is van, az ábécé sorrendben elsővel térjen vissza.
   
   • Az eddig teljesített elemek átlagos költsége.
   
   • Az összes teljesitett elem, a kipróbálás éve szerint rendezve.
   
   • Az eddig meglátogatott éttermek közül a legdrágább neve és költsége, vesszővel elválasztva.
   
   • Annak az országnak a neve, amelyben a legtöbb látnivaló található.
6. A főprogram az elemek bekérése után hívja meg valamennyi metódust és az eredményüket írja ki egy eredmény.txt nevű file-ba!
   Az eredmények elé írja oda a metódus nevét is!
7. A forráskódot és az eredmény.txt-t küldje el emailben a barna_iszaly@epam.com és attila_piros@epam.com címekre!