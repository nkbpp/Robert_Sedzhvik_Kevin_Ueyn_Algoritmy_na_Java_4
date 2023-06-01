package Chapter_1_3.Stack;

import java.util.Iterator;

/**
 * Стек на основе динамического массива
 */
public class ResizingArrayStack<T> implements Iterable<T> {

    private T[] a = (T[]) new Object[1];
    private int N = 0;

    /**
     * Добавление элемента
     */
    public void push(T item){
        if(a.length == N){
            resize(a.length * 2);
        }
        a[N++] = item;
    }

    /**
     * Удаление самого старого элемента
     */
    public T pop(){
        T item = a[--N];
        a[N] = null;
        if(N > 0 && N == a.length/4){
            resize(a.length/2);
        }
        return item;
    }

    /**
     * Стек пуст?
     */
    public boolean isEmpty(){
        return N == 0;
    }

    /**
     * Количество элементов в стеке
     */
    public int size(){
        return N;
    }

    /**
     * Перемещение стека в массив другого размера
     */
    private void resize(int max){
        T[] newArr = (T[]) new Object[max]; //обобщенные массивы в java запрещены
        for (int i = 0; i < N; i++) {
            newArr[i] = a[i];
        }
        a = newArr;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>(){

            private int i = N;
            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public T next() {
                return a[--i];
            }
        };
    }

}
