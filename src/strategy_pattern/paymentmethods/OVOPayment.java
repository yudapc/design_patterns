package strategy_pattern.paymentmethods;

import strategy_pattern.PaymentStrategy;

public class OVOPayment implements PaymentStrategy {
    public String number;
    public double amount;

    public OVOPayment(String number, double amount) {
        this.number = number;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("OVO Payment: " + number + " " + amount);
    }
}
