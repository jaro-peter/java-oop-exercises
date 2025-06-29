package hu.jaro.peter.parking;


/*

4. Hozzuk létre a SzemelyGepjarmuInterface-t, amely a következő függvényleírást tartalmazza:
- kategoria() - a függvény a következő (egész szám) visszatérési értékekkel térhet vissza:
1 - ha a szállítható személyek száma kisebb vagy egyenlő mint 2
2 - ha a szállítható személyek száma több mint 2 és kisebb vagy egyenlő mint 5
3 - ha a szállítható személyek száma több mint 5 és kisebb vagy egyenlő mint 10
4 - ha a szállítható személyek száma több mint 10

**/
public interface SzemelyGepjarmuInterface  {

    public int kategoria();

}
