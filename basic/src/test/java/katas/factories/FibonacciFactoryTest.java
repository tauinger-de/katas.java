package katas.factories;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FibonacciFactoryTest {

    @Test
    void fibonacci() {
        // given
        var f = new FibonacciFactory();

        // when
        var numbers = List.of(
                f.next(),
                f.next(),
                f.next(),
                f.next(),
                f.next(),
                f.next()
        );

        // then
        Assertions.assertThat(numbers).containsExactly(
                1, 1, 2, 3, 5, 8
        );
    }
}
