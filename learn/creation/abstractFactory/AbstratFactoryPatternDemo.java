package learn.creation.abstractFactory;

/**
 * 抽象工厂模式
 * 围绕一个超级工厂创建其他工厂
 */
public class AbstratFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory colorFactory = factoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();
        AbstractFactory shape = factoryProducer.getFactory("shape");
        Shape rectangle = shape.getShape("RECTANGLE");
        rectangle.draw();
    }
}