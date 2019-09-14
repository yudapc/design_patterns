package state_pattern.concrete;

import state_pattern.Context;
import state_pattern.State;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in Stop State");
        context.setState(this);
    }

    public String toString() {
        return "Stop String";
    }
}
