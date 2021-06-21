package io.github.mayyanar27.designpattern.behaviour.iterator;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 17:41
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");

        IteratorImpl<String> stringIterator = new IteratorImpl<>(strings);
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
