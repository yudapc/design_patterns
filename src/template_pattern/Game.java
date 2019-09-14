package template_pattern;

public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
