package io.github.mayyanar27.designpattern.creational.protype;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 12:17
 */
public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeDP prototypeDP = new PrototypeDP("ayyanar",27,"chennai","chenna");
        System.out.println(prototypeDP.toString());
        Object clone = prototypeDP.clone();
        System.out.println(clone.toString());
    }
}
