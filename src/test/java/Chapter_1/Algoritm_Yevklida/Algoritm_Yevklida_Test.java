package Chapter_1.Algoritm_Yevklida;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Algoritm_Yevklida_Test {

    @ParameterizedTest(name = "[{index}] - gcd({0}, {1}) = {2}")
    @CsvSource(
            value = {
                    "10, 6, 2",
                    "3, 2, 1",
                    "2, 3, 1",
                    "0, 3, 3",
                    "3, 0, 3",
                    "10, 5, 5"
            },
            ignoreLeadingAndTrailingWhitespace = true
    )
    void test_gcd(int p, int q, int result) {
        Algoritm_Yevklida algoritm_yevklida = new Algoritm_Yevklida();

        int actualSolution = algoritm_yevklida.gcd(p, q);

        assertThat(actualSolution).isEqualTo(result);
    }


}