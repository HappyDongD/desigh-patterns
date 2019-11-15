package learn.structure.adapterPattern;

/**
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        //一些操作...
        super.adapteeRequest();
        //一些操作...
    }
}
