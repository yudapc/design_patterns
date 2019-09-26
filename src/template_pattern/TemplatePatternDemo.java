package template_pattern;


import template_pattern.games.Basket;
import template_pattern.games.Cricket;
import template_pattern.games.Football;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println();

        Game football = new Football();
        football.play();

        System.out.println();

        Game basket = new Basket();
        basket.play();
    }
}
