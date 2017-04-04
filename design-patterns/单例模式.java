单例模式包含5种方式，分别为饿汉式、懒汉式、双重锁方式、静态内部类方式和枚举方式，
其中Effective Java推荐的方式是枚举方式。
Android源码中的单例模式有InputMethodManager、BluetoothOppManager、AccessibilityManager等

/**
 *饿汉式
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}

/**
 *懒汉式
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/**
 *双重锁方式
 */
public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null) {
            synchronized(Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/**
 *静态内部类方式
 */
public class Singleton {
    private static class Holder{
        static Singleton instance = new Singleton();
    }
    private Singleton(){}
    public static Singleton getInstance(){
        return Holder.instance;
    }
}

/**
 *枚举方式
 */
public enum Singleton {
    instance;
}
