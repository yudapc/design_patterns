package strategy_pattern.paymentmethods;

import strategy_pattern.PaymentStrategy;

public class CashPayment implements PaymentStrategy {
    public double amount;

    public CashPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Cash: " + amount + "$");
    }
}
