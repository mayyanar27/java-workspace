package io.github.mayyanar27.advanced.functionalinterface;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 15:57
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        FunctionalInterface1<String> interface1 = (name) ->{
            System.out.println(name);
            return name;
        };

        System.out.println(interface1.test("ayyanar"));
        functionalInterfaceTest(interface1);
    }

    static void  functionalInterfaceTest(FunctionalInterface1 interface1){
        interface1.test("Ayyanar");
    }
}
