package learn.creation.SingletonPattern;

/**
 * 双重检查
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：复杂
 *
 * 性能
 * 如果第一次检查instance不为null，那就不需要执行下面的加锁和初始化操作，因此可以大幅度降低synchronized带来的性能开销+
 *
 * 为什么需要加volatile？
 * 先说下new Object()在底层是几步骤
 * 1.memory=allocate()分配对象的内存空间。
 * 2.createInstance()初始化对象
 * 3.instance=memory 设置instance指向刚分配的内存
 * 再说下为什么需要volatile
 * 如果发生重排序，另一个并发执行的线程B就有可能在第一次判断instance不为null，线程B接下来访问instance所引用的对象，但此时这个对象还没有被初始化
 *
 * 解决方法：
 * 1.不允许重排（双重检查）
 * 2.允许重排，但不允许其他线程看到这个重排序（静态内部类）
 *
 */
public class DCLSingleton {
    private volatile static DCLSingleton instance;

    private DCLSingleton() {

    }

    public static DCLSingleton getSingleton() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
