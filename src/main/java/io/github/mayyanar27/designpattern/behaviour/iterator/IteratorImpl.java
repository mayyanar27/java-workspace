package io.github.mayyanar27.designpattern.behaviour.iterator;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 17:38
 */
public class IteratorImpl<T> implements IIterator<T> {
    private List<T> list = null;
    int curIndex = 0;

    @Override
    public boolean hasNext() {
        return curIndex != list.size();
    }

    @Override
    public T next() {
        return list.get(curIndex++);
    }

    public IteratorImpl(List<T> list) {
        this.list = list;
    }
}
