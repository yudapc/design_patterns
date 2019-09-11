package strategy_pattern.paymentmethods;

import strategy_pattern.PaymentStrategy;

public class CardPayment implements PaymentStrategy {
    public String cardType;
    public String issuer;
    public double amount;

    public CardPayment(String cardType, String issuer, double amount) {
        this.cardType = cardType;
        this.issuer = issuer;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Card Payment: " + issuer + " " + cardType + " " + amount + "$");
    }
}
