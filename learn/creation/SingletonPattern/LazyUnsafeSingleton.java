package learn.creation.SingletonPattern;

/**
 * 懒汉式
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 */
public class LazyUnsafeSingleton {
    private static LazyUnsafeSingleton lazyUnsafeSingleton;

    private LazyUnsafeSingleton() {
    }

    public static LazyUnsafeSingleton getSingleton() {
        if (lazyUnsafeSingleton == null) {
            lazyUnsafeSingleton = new LazyUnsafeSingleton();
        }
        return lazyUnsafeSingleton;
    }
}
