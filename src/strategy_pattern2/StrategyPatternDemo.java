package strategy_pattern2;

import strategy_pattern2.concrete.OperationAdd;
import strategy_pattern2.concrete.OperationMultiply;
import strategy_pattern2.concrete.OperationSubstract;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 2 = " + context.executeStrategy(10, 2));

        context = new Context(new OperationMultiply());
        System.out.println("2 * 3 = " + context.executeStrategy(2, 3));
    }
}
