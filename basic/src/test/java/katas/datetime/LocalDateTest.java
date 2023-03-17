package katas.datetime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocalDateTest {

    @Test
    void firstOfMay1980() {
        // when
        var ld = LocalDateSupplier.firstOfMay1980();

        // then
        Assertions.assertThat(ld).isNotNull();
        Assertions.assertThat(ld.toString()).isEqualTo("1980-05-01");
    }
}
