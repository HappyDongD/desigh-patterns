package learn.structure.FlyweightPattern;

/**
 * 享元模式
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
 * 我们将通过创建 5 个对象来画出 20 个分布于不同位置的圆来演示这种模式。
 * 由于只有 5 种可用的颜色，所以 color 属性被用来检查现有的 Circle 对象。
 * 应用实例： 1、JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。 2、数据库的数据池。
 */
public class FlyweightPatternDemo {
    private static final String[] colors =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}