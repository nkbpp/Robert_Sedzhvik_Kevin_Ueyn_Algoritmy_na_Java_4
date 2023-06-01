package Chapter_1.Algoritm_Yevklida;

public class Algoritm_Yevklida {

    /**
     * эффективный алгоритм для нахождения наибольшего общего делителя двух целых чисел
     */
    public int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

}
