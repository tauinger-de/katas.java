package katas.basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondsCalc {

    /**
     * Coding Kata: Transform a number of seconds into a number of years plus days.
     * The number of days is meant to be in addition to the number of years, not the number of
     * days in total represented just be the number of seconds.
     */
    @Test
    void convertSecondsToYearsAndDays() {
        // given
        long seconds = 123456789;

        // when
        long days = 0;
        long years = 0;

        // then
        Assertions.assertThat(days).isEqualTo(333);
        Assertions.assertThat(years).isEqualTo(3);
    }
}
