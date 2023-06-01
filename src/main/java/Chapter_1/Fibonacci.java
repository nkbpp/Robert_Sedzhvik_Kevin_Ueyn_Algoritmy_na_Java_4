package Chapter_1;

public class Fibonacci {

    public int[] getArr(int n) {
        if(n<0) {return new int[0];}
        int[] arr = new int[n + 1];
        int f = 0;
        int g = 1;
        for (int i = 0; i <= n; i++) {
            arr[i] = f;
            f = f + g;
            g = f - g;
        }
        return arr;
    }

}
