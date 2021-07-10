package org.example;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 18:03
 */
public class FirstTest {
    @Test
    public void abc() {
        Assumptions.assumeTrue(false);
        assertEquals("a", "a");
    }

    @Test
    @Disabled
    public void testAbc(){
        assertEquals(111,111);
    }
}
