package katas.lambda;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SuppressWarnings("DataFlowIssue")
public class LambdaTest {

    /**
     * Task: Implement the `Function` lambda so that the expected result is computed.
     */
    @Test
    void lambdasOfStdInterfaces() {
        // given
        Supplier<Integer> supplier = () -> 4;
        Function<Integer, Integer> function = null; // todo

        // when
        int result = function.apply(supplier.get());

        // then
        Assertions.assertThat(result).isEqualTo(16);
    }

    /**
     * Tasks:
     * <ol>
     *     <li>Implement the `supply()` Method to produce a lambda instance (closure) based on the
     *      given argument</li>
     *      <li>Implement a `Consumer` that writes the desired output into the `StringBuilder`
     *      (access to local variables)</li>
     * </ol>
     */
    @Test
    void lambdasOfStdInterfaces2() {
        // given
        StringBuilder sb = new StringBuilder();
        Supplier<String> supplier = supply("Hola");
        Function<String, Integer> function = null;  // todo
        Consumer<Integer> consumer = null;  // todo

        // when
        consumer.accept(function.apply(supplier.get()));

        // then
        Assertions.assertThat(sb.toString()).isEqualTo("char count: 4");
    }

    private Supplier<String> supply(String hola) {
        return null; // todo
    }
}
