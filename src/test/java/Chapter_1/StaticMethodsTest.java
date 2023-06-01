package Chapter_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class StaticMethodsTest {

    /**
     * abs (int)
     */
    @ParameterizedTest(name = "[{index}] - abs({0}) = {1}")
    @CsvSource(
            value = {
                    "-10, 10",
                    "0, 0",
                    "2, 2"
            },
            ignoreLeadingAndTrailingWhitespace = true
    )
    void abs_int(int x, int result) {
        int actualSolution = StaticMethods.abs(x);

        assertThat(actualSolution).isEqualTo(result);
    }

    @Test
    void abs_int_min() {
        int actualSolution = StaticMethods.abs(Integer.MIN_VALUE);

        assertThat(actualSolution).isEqualTo(Integer.MIN_VALUE); // Парадокс
    }

    /**
     * abs (double)
     */
    @ParameterizedTest(name = "[{index}] - abs({0}) = {1}")
    @CsvSource(
            value = {
                    "-10, 10",
                    "0, 0",
                    "2, 2"
            },
            ignoreLeadingAndTrailingWhitespace = true
    )
    void abs_double(double x, double result) {
        double actualSolution = StaticMethods.abs(x);

        assertThat(actualSolution).isEqualTo(result);
    }

    @Test
    void abs_double_min() {
        double actualSolution = StaticMethods.abs(Double.MIN_VALUE);

        assertThat(actualSolution).isEqualTo(Double.MIN_VALUE); // Парадокс
    }


    /**
     * isPrime
     */
    @ParameterizedTest(name = "[{index}] - isPrime({0}) = {1}")
    @CsvSource(
            value = {
                    "-10, false",
                    "0, false",
                    "25, false",
                    "21, false",
                    "1073676287, true",
                    "2147483647, true",
                    "2, true"
            },
            ignoreLeadingAndTrailingWhitespace = true
    )
    void isPrime(int n, boolean result) {
        boolean actualSolution = StaticMethods.isPrime(n);

        assertThat(actualSolution).isEqualTo(result);
    }

    /**
     * Гармоническое число
     */
    @ParameterizedTest(name = "[{index}] - H({0}) = {1}")
    @CsvSource(
            value = {
                    "1, 1",
                    "2, 1.5",
                    "3, 1.833",
                    "8, 2.718",
                    "1_000_000, 14.393"
            },
            ignoreLeadingAndTrailingWhitespace = true
    )
    void h(int n, double result) {
        double actualSolution = StaticMethods.H(n);

        assertThat(actualSolution).isEqualTo(result, withPrecision(3d)); //с точностью
    }


    /**
     * Гипотенуза прямоугольного треугольника
     */
    @ParameterizedTest(name = "[{index}] - hypotenuse({0}, {1}) = {2}")
    @CsvSource(
            value = {
                    "3, 4, 5"
            },
            ignoreLeadingAndTrailingWhitespace = true
    )
    void hypotenuse(double a, double b, double result) {
        double actualSolution = StaticMethods.hypotenuse(a, b);

        assertThat(actualSolution).isEqualTo(result, withPrecision(3d)); //с точностью
    }

    /**
     * Квадратный корень (метод Ньютона)
     */
    @ParameterizedTest(name = "[{index}] - sqrt({0}) = {1}")
    @CsvSource(
            value = {
                    "25, 5"
            },
            ignoreLeadingAndTrailingWhitespace = true
    )
    void sqrt(double a, double result) {
        double actualSolution = StaticMethods.sqrt(a);

        assertThat(actualSolution).isEqualTo(result, withPrecision(3d)); //с точностью
    }
}