package abstract_factory_pattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // basic shape
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        System.out.println("----------------------------------");

        // rounded
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();

        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");
        roundedSquare.draw();
    }
}
