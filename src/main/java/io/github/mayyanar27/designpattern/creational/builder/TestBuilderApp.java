package io.github.mayyanar27.designpattern.creational.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 12:10
 */
public class TestBuilderApp {
    public static void main(String[] args) {
        BuilderDP1 ayyanar = new BuilderDP1.Builder().setName("ayyanar").setAge(123).build();
        System.out.println(ayyanar.toString());
    }
}
