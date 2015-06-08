package design.creation.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private long index;

    public static Singleton getSingleton() {
        return singleton;
    }

    public long getIndex() {
        if (index == 0L) {
            index = System.currentTimeMillis();
        }
        return index;
    }

}
