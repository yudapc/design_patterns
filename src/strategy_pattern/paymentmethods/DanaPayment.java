package strategy_pattern.paymentmethods;

import strategy_pattern.PaymentStrategy;

public class DanaPayment implements PaymentStrategy {
    public String phoneNumber;
    public String code;
    public double amount;


    public DanaPayment(String phoneNumber, String code, double amount) {
        this.phoneNumber = phoneNumber;
        this.code = code;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("DANA Payment: " + phoneNumber + " - " + code + " " + amount);
    }
}
