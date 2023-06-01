package Chapter_1;

public class StaticMethods {

    /**
     * Абсолютная величина значения x (int)
     */
    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    /**
     * Абсолютная величина значения x (double)
     */
    public static double abs(double x) {
        if (x < 0.0) {
            return -x;
        } else {
            return x;
        }
    }

    /**
     * Абсолютная величина значения x (double)
     */
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i > 1 && i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Гармоническое число
     */
    public static double H(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    /**
     * Гипотенуза прямоугольного треугольника
     */
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    /**
     * Квадратный корень (метод Ньютона)
     */
    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

}
