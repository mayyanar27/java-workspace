package io.github.mayyanar27.designpattern.behaviour.iterator;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 17:36
 */
public interface IIterator<T> {
    boolean hasNext();

    T next();
}
