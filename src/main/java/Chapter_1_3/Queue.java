package Chapter_1_3;

import java.util.Iterator;

/**
 * Очередь
 */
public class Queue<T> implements Iterable<T> {
    public Queue() {
    }

    /**
     * Добавление элемента
     */
    public void add(T item){
    }

    /**
     * Удаление самого старого элемента
     */
    public T dequeue(){
        return null;
    }

    /**
     * Очередь пуста?
     */
    public boolean isEmpty(){
        return true;
    }

    /**
     * Количество элементов в очереди
     */
    public int size(){
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
