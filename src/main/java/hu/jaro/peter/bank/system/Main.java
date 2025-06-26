package hu.jaro.peter.bank.system;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new NormalAccount(1000);
        BankAccount acc2 = new TravelAccount(500);

        acc1.transferTo(acc2, 200);
        acc2.payWithCard(100);

        System.out.println(acc1);
        System.out.println(acc2);


        String a =acc1.toString();
        System.out.println(a);
        System.out.println(acc2.toString());
    }
}

