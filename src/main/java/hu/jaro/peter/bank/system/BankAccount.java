package hu.jaro.peter.bank.system;

/**
 * Hozz létre egy BankAccount nevű absztrakt osztályt, amely tartalmazza a következőket:
 * o	Egy összeg (balance) adattagot, amely a számla aktuális egyenlegét tárolja.
 * o	Két absztrakt metódust:
 * 	transferTo(BankAccount other, double amount): pénz átutalása egy másik számlára.
 * 	payWithCard(double amount): bankkártyás fizetés kezelése.
 */
public abstract class BankAccount {

    public double balance;

    public BankAccount(){}
    public BankAccount(double balance) {

        this.balance = balance;
    }

    public abstract void transferTo(BankAccount other, double amount);

    public abstract void payWithCard(double amount);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}