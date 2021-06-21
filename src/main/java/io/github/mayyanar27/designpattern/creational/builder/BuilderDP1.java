package io.github.mayyanar27.designpattern.creational.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 12:04
 */
public class BuilderDP1 {
    private String name;
    private String address;
    private int age;
    private String officeAddress;

    public BuilderDP1(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.officeAddress = builder.officeAddress;

    }

    @Override
    public String toString() {
        return "BuilderDP1{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", officeAddress='" + officeAddress + '\'' +
                '}';
    }

    public Builder createBuilder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private String address;
        private int age;
        private String officeAddress;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setOfficeAddress(String officeAddress) {
            this.officeAddress = officeAddress;
            return this;
        }

        public BuilderDP1 build() {
            return new BuilderDP1(this);
        }
    }
}
