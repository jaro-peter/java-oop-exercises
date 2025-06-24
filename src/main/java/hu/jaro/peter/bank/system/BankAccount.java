package hu.jaro.peter.bank.system;

/**
 * Hozz létre egy BankAccount nevű absztrakt osztályt, amely tartalmazza a következőket:
 * o	Egy összeg (balance) adattagot, amely a számla aktuális egyenlegét tárolja.
 * o	Két absztrakt metódust:
 * 	transferTo(BankAccount other, double amount): pénz átutalása egy másik számlára.
 * 	payWithCard(double amount): bankkártyás fizetés kezelése.
 */
public abstract class BankAccount {

    private float balance;
   abstract void transferTo(BankAccount other, double amount);

    abstract void payWithCard(double amount);
}