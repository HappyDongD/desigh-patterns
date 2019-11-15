package learn.creation.SingletonPattern;

/**
 * 静态内部类
 * JVM在类的初始化阶段（即在Class被加载后，且被线程使用之前会执行类的初始化。
 * 在执行类的初始化期间，JVM会去获取一个锁。这个锁可以同步多个线程对同一个类的初始化
 */
public class InnerClassSingleton {
    public InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
