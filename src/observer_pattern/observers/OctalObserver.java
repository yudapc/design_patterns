package observer_pattern.observers;

import observer_pattern.Observer;
import observer_pattern.Subject;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toBinaryString(subject.getState()));
    }
}
