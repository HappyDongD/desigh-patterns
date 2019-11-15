package learn.structure.bridgePattern;

/**
 * 桥接模式
 * 将抽象部分与他的实现部分分离，使他们都可以独立地变化
 *
 * -- 角色
 * Abstraction（抽象类）
 * RefinedAbstraction(扩充抽象类)
 * Implementor（实现类接口）
 * ConcreteImplementor（具体实现类）
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
