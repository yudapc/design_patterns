package observer_pattern.observers;

import observer_pattern.Observer;
import observer_pattern.Subject;

public class BiasaObserver extends Observer {
    public BiasaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Biasa Observer: " + subject.getState());
    }
}
