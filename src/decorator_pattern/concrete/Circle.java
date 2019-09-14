package decorator_pattern.concrete;

import decorator_pattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: circle");
    }
}
