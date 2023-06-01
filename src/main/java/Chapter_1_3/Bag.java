package Chapter_1_3;

import java.util.Iterator;

/**
 * Контейнер
 */
public class Bag<T> implements Iterable<T> {

    public Bag() {
    }

    /**
     * Добавление элемента
     */
    public void add(T item){

    }

    /**
     * Контейнер пуст?
     */
    public boolean isEmpty(){
        return true;
    }

    /**
     * Количество элементов в контейнере
     */
    public int size(){
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
