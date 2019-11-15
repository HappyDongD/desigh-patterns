package learn.creation.SingletonPattern;

/**
 * 懒汉式
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance;

    private LazySafeSingleton() {
    }

    public static synchronized LazySafeSingleton getSingleton() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
