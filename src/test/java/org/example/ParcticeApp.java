package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 18:10
 */
public class ParcticeApp {
    int a = 2;
    int y = 2;
    int z = 3;

    @Test
    public void test1() {
        Assertions.assertTrue(a == y);
    }

    @Test
    public void test2() {
        Assertions.assertFalse(y == z);
    }
}
