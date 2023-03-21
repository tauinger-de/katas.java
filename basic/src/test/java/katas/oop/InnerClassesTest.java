package katas.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InnerClassesTest {

    @Test
    void innerClasses() {
        // given
        var outer = new Outer();

        // when
        outer.modifyNameInInnerClass();

        // then
        Assertions.assertThat(outer.name).isEqualTo("The Name");
    }
}


class Outer {

    String name;

    void modifyNameInInnerClass() {
        // todo implement me
    }

}
