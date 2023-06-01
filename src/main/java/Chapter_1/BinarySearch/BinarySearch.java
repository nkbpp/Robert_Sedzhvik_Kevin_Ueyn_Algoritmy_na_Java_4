package Chapter_1.BinarySearch;

public class BinarySearch {

    /**
     * Двоичный (бинарный) поиск  — классический алгоритм поиска элемента в отсортированном массиве
     */
    public static int rank(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid]) high = mid - 1;
            else if (key > a[mid]) low = mid + 1;
            else return mid;
        }
        return -1;
    }

    /**
     * Двоичный (бинарный) поиск  (рекурсия)
     */
    public static int rank_r(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (key < a[mid]) {
            return rank(key, a, low, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, high);
        } else {
            return mid;
        }
    }

}
