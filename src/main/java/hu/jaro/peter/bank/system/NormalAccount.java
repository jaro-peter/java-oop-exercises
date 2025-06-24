package hu.jaro.peter.bank.system;

/**
 * 2. Működésbeli különbségek
 * A különböző számlatípusok eltérően valósítják meg az alábbi műveleteket:
 * •	Transfer (utalás):
 * o	NormalAccount esetén az utalt összegből 2% jutalékot vonjon le a küldő számláról,
 *  és a maradék érkezzen meg a fogadó számlára.
 * o	TravelAccount esetén az utalás fix 5 egység díjjal történik, amit a küldő számláról von le.
 * •	Bankkártyás fizetés (payWithCard):
 * o	NormalAccount esetén a fizetésnél 0% kezelési költség adódik az összeghez.
 * o	TravelAccount esetén a bankkártyás fizetés devizakonverzióval együtt 3% extra költséget jelent.
 */
public class NormalAccount extends BankAccount{
    @Override
    void transferTo(BankAccount other, double amount) {

    }

    @Override
    void payWithCard(double amount) {

    }
}