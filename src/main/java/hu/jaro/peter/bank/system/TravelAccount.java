package hu.jaro.peter.bank.system;

/**
 * 2. Működésbeli különbségek
 * A különböző számlatípusok eltérően valósítják meg az alábbi műveleteket:
 * •	Transfer (utalás):
 * o
 * o	TravelAccount esetén az utalás fix 5 egység díjjal történik, amit a küldő számláról von le.
 * •	Bankkártyás fizetés (payWithCard):
 * o
 * o	TravelAccount esetén a bankkártyás fizetés devizakonverzióval együtt 3% extra költséget jelent.
 *
 */
public class TravelAccount extends BankAccount{


    public TravelAccount(double balance) {
        super(balance);
    }

    @Override
    public void transferTo(BankAccount other, double amount) {
        if (balance>= amount+5){
            balance = balance- (amount+5);
            other.balance= other.balance+ amount;
        }
        else System.out.println("nincs elég pénz");

    }

    @Override
    public void payWithCard(double amount) {
           if (balance>= amount*1.03){
               balance= balance- (amount*1.03);
           }
           else System.out.println("nincs elég pénz");
    }

    @Override
    public String toString() {
        return "TravelAccount{" +
                "balance=" + balance +
                '}';
    }
}


