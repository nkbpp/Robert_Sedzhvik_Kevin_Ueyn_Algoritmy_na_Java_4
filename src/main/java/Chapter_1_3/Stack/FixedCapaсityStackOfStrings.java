package Chapter_1_3.Stack;

/**
 * Стек строк с фиксированной емкостью
 */
public class FixedCapaсityStackOfStrings {

    private String[] a;
    private int N;

    public FixedCapaсityStackOfStrings(int n) {
        a = new String[n];
    }


    /**
     * Добавление элемента
     */
    public void push(String item){
        if(a.length != N +1){
            a[N++] = item;
        }
    }

    /**
     * Удаление самого старого элемента
     */
    public String pop(){
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
