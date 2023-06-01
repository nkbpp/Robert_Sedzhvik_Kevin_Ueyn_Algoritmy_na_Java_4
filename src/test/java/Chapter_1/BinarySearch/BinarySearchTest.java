package Chapter_1.BinarySearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    /**
     * rank (int)
     */
    @ParameterizedTest(name = "[{index}] - rank({0},{1}) = {2}")
    @ArgumentsSource(BinarySearchArgumentsProvider.class)
    void rank(int key, int[] arr, int result) {
        int actualSolution = BinarySearch.rank(key, arr);

        assertThat(actualSolution).isEqualTo(result);
    }

    /**
     * rank_r рекурсия
     */
    @ParameterizedTest(name = "[{index}] - rank_r({0},{1}) = {2}")
    @ArgumentsSource(BinarySearchArgumentsProvider.class)
    void rank_r(int key, int[] arr, int result) {
        int actualSolution = BinarySearch.rank_r(key, arr);

        assertThat(actualSolution).isEqualTo(result);
    }
}

class BinarySearchArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(5, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 4),
                Arguments.of(1, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0),
                Arguments.of(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9)
        );
    }
}