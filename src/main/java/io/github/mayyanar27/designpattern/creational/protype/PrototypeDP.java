package io.github.mayyanar27.designpattern.creational.protype;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 12:14
 */
public class PrototypeDP implements Cloneable {
        private String name;
        private int age;
        private String address;
        private String office_address;

    public PrototypeDP(String name, int age, String address, String office_address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.office_address = office_address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
