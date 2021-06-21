package io.github.mayyanar27.designpattern.creational.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 12:01
 */
public enum SingletonUsingEnum {
    getInstance();

    public static void main(String[] args) {
        SingletonUsingEnum getInstance = SingletonUsingEnum.getInstance;
        SingletonUsingEnum getInstance1 = SingletonUsingEnum.getInstance;
        System.out.println(getInstance.toString());
        System.out.println(getInstance1.toString());
    }
}
