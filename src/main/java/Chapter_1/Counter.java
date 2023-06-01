package Chapter_1;

public class Counter {
    private final String name;
    private int count;

    public Counter(String name) {
        this.name = name;
    }

    public void increment(){
        count++;
    }

    public int tally(){
        return count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
