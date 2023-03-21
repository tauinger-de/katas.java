package katas.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DefaultMethodsTest {

    @Test
    void urlGenerator() {
        // given
        Generator gen;

        // when
        var url = gen.buildUrl();

        // then
        Assertions.assertThat(url).isEqualTo("https://www.example.com/index.html");
    }

}

interface Generator {

    default String prefix() {
        return "http://www.";
    }

    default String suffix() {
        return "/index.html";
    }

    String hostName();

    default String buildUrl() {
        return prefix() + hostName() + suffix();
    }

}
