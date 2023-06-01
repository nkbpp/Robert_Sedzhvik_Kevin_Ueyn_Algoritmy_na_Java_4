package Chapter_1;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

    @ParameterizedTest(name = "[{index}] - getArr({0}) = {1}")
    @ArgumentsSource(FibonacciArgumentsProvider.class)
    void getArr(int n, int[] result) {
        Fibonacci fibonacci = new Fibonacci();

        int[] actualSolution = fibonacci.getArr(n);

        assertThat(actualSolution).containsExactly(result);
    }
}

class FibonacciArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(22, new int[]{
                        0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
                        55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
                        6765, 10946, 17711}),
                Arguments.of(9, new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}),
                Arguments.of(-9, new int[]{})
        );
    }
}