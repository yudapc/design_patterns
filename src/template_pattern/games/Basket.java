package template_pattern.games;

import template_pattern.Game;

public class Basket extends Game {
    @Override
    public void initialize() {
        System.out.println("Basket initializing...");
    }

    @Override
    public void startPlay() {
        System.out.println("Basket start");
    }

    @Override
    public void endPlay() {
        System.out.println("Basket end!");
    }
}
