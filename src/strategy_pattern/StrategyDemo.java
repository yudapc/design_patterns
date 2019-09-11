package strategy_pattern;

import strategy_pattern.paymentmethods.*;

public class StrategyDemo {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Kopi Kulo", 10.5));
        order.addItem(new Item("Ayam Chikidot Lumer", 9.4));
        order.addItem(new Item("Rokok Evolution Hijau", 11));
        order.addItem(new Item("Kopi Janji Jiwa", 18));

        System.out.println("---------------------------------------------");
        order.makePayment(new CashPayment(  20));
        order.makePayment(new CardPayment("CREDIT", "VISA", 10));
        order.makePayment(new CardPayment("DEBIT", "MANDIRI", 11));
        order.makePayment(new OVOPayment("0812738827388", 18));
        order.makePayment(new GopayPayment("085769796363", 20));
        order.makePayment(new DanaPayment("08773672873", "DNTRX00187XX23", 1.9));
        System.out.println("---------------------------------------------");
    }
}
