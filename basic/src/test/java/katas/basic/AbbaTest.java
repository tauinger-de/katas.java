package katas.basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbbaTest {

    /**
     * Given two strings, a and b, return the result of putting them
     * together in the order abba,
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */
    @Test
    void abbaTest() {
        String result = makeAbba("a", "b");
        Assertions.assertThat(result).isEqualTo("abba");

        result = makeAbba("What", "Up");
        Assertions.assertThat(result).isEqualTo("WhatUpUpWhat");
    }

    String makeAbba(String a, String b) {
        // TODO
        return "TODO";
    }
}
