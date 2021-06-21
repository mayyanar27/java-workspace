package io.github.mayyanar27.advanced.functionalinterface;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 15:57
 */
@FunctionalInterface
public interface FunctionalInterface1<T> {
    T test(T name);

    default T test2(T name) {
        return (T) "dummay";
    }
}
