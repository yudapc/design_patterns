package command_pattern.concrete;

import command_pattern.Order;
import command_pattern.Stock;

public class BuyStock implements Order {
     private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
