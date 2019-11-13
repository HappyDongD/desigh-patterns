package learn.creation.abstractFactory;

import java.util.Objects;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (Objects.isNull(shapeType)) {
            return null;
        }
        if (Objects.equals(shapeType, "CIRCLE")) {
            return new Circle();
        }
        if (Objects.equals(shapeType, "RECTANGLE")) {
            return new Rectangle();
        }
        if (Objects.equals(shapeType, "SQUARE")) {
            return new Square();
        }
        return null;
    }
}