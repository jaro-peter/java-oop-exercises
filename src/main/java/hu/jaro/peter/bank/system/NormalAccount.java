package hu.jaro.peter.bank.system;

/**
 * 2. Működésbeli különbségek
 * A különböző számlatípusok eltérően valósítják meg az alábbi műveleteket:
 * •	Transfer (utalás):
 * o	NormalAccount esetén az utalt összegből 2% jutalékot vonjon le a küldő számláról,
 *  és a maradék érkezzen meg a fogadó számlára.

 * •	Bankkártyás fizetés (payWithCard):
 * o	NormalAccount esetén a fizetésnél 0% kezelési költség adódik az összeghez.
 * o
 */
public class NormalAccount extends BankAccount{

    public NormalAccount(){
        super();
    }
    public NormalAccount(double balance){
        super(balance);
    }

    @Override
    public void transferTo(BankAccount other, double amount) {
        if (balance>=amount){
            this.balance = this.balance -amount;
            other.balance = other.balance + amount*0.98;
        }
        else System.out.println("nincs elég fedezet");

    }


    @Override
    public void payWithCard(double amount) {
        if (this.balance>= amount){
            balance=balance-amount;
        }
        else System.out.println("nincs elég pénz");

    }

    @Override
    public String toString() {
        return "NormalAccount:" +
                "balance=" + balance ;
    }
}