package learn.creation.factoryPattern;

import java.util.Objects;

public class ShapeFactory {
    public Shape getShape(String shapeType){
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
