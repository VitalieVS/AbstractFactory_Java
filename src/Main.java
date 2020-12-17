import factory.AbstractFactory;
import factory.FactoryProducer;
import factory.Shape;
import factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape1 = shapeFactory1.getShape("RECTANGLE");
        shape1.draw();
    }
}
