package katas.basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondsCalc {

    @Test
    void convertSecondsToYearsAndDays() {
        // given
        long seconds = 1234567890123L;

        // when
        // TODO
        long days = 0;
        long years = 0;

        // then
        Assertions.assertThat(days).isEqualTo(3);
        Assertions.assertThat(years).isEqualTo(10);
    }
}
