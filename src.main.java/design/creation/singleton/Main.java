package design.creation.singleton;

public class Main {
    public static void main(String args[]) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        if (singleton1.getIndex() == singleton2.getIndex()) {
            System.out.println("Class is singleton");
            return;
        }
        System.out.println("Class is not singleton");
    }

}
