package singleton.java;

public class Singleton {
    public static Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public void foo() {}
}
