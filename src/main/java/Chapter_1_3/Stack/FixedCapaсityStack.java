package Chapter_1_3.Stack;

/**
 * Стек строк с фиксированной емкостью
 */
public class FixedCapaсityStack<T> {

    private T[] a;
    private int N;

    public FixedCapaсityStack(int n) {
        a = (T[]) new Object[n]; //обобщенные массивы в java запрещены
    }


    /**
     * Добавление элемента
     */
    public void push(T item){
        if(a.length != N +1){
            a[N++] = item;
        }
    }

    /**
     * Удаление самого старого элемента
     */
    public T pop(){
        return a[--N];
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

}
