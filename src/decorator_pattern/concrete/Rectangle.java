package decorator_pattern.concrete;

import decorator_pattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: rectangle");
    }
}
