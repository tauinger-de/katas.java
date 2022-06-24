package katas.basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiddleThreeTest {

    /**
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
     * The string length will be at least 3 -- otherwise an IllegalArgumentException must be thrown.
     */
    @Test
    void middleThreeTest() {
        // positive check #1
        String result = middleThree("candy");
        Assertions.assertThat(result).isEqualTo("and");

        // positive check #2
        result = middleThree("foo");
        Assertions.assertThat(result).isEqualTo("foo");

        // negative check #1 -- input is null
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> middleThree(null));

        // negative check #2 -- input is blank text
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> middleThree(""));

        // negative check #3 -- input is less than 3 chars
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> middleThree("n"));

        // negative check #4 -- input is not a string with an odd number of chars
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> middleThree("nnnn"));
    }


    public String middleThree(String str) {
        return "TODO";  // TODO
    }

}
