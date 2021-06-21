package org.example;

import io.github.mayyanar27.testing.junit.TestExcepiton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 18:19
 */
public class TestException {
    @Test()
    public void testException() throws Exception {

        Exception ex = Assertions.assertThrows(Exception.class, () -> TestExcepiton.testException(), "d ddddd");
        assertEquals("hi am exception", ex.getMessage());

    }
}
