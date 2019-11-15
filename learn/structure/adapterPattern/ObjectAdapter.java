package learn.structure.adapterPattern;

/**
 * 对象适配器
 * 注意这里的adapter是将adaptee作为一个成员属性
 */
public class ObjectAdapter implements Target {

    //被适配者是对象适配器的一个属性
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
