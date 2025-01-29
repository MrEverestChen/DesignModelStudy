package org.example;

public class Singleton {

    private static final Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() { return instance; }

    public void sayHello() {
        System.out.println("Singleton.sayHello");
    }

    public static void main(String[] args) {
//        单例模式
//        类加载到内存之后就实例化一个单例，JVM保证线程安全
//        缺点：不管用不用，类装载时就会完成实例化
        Singleton singleton_1 = Singleton.getInstance();
        Singleton singleton_2 = Singleton.getInstance();
        System.out.println(singleton_2 == singleton_1);


    }

}
