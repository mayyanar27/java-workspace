package io.github.mayyanar27.designpattern.creational.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 11:57
 */
public class SingletonDP1 {
    private static SingletonDP1 singletonDP1 = new SingletonDP1();

    private SingletonDP1() {
    }

    public static SingletonDP1 getInstance() {
        return singletonDP1;
    }

    public static void main(String[] args) {
        SingletonDP1 instance = SingletonDP1.getInstance();
        SingletonDP1 instance1 = SingletonDP1.getInstance();
        System.out.println(instance.toString());
        System.out.println(instance1.toString());

    }
}
