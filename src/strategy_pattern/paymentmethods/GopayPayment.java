package strategy_pattern.paymentmethods;

import strategy_pattern.PaymentStrategy;

public class GopayPayment implements PaymentStrategy {
    public String phoneNumber;
    public double amount;

    public GopayPayment(String phoneNumber, double amount) {
        this.phoneNumber = phoneNumber;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Gopay Payment: " + phoneNumber + " " + amount);
    }
}
