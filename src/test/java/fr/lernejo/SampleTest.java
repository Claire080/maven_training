package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op_add() {
        int T = 10;
        int U = 2;
        int R = new Sample().op(Sample.Operation.ADD,T,U);
        Assertions.assertThat(R).as("addition of 10 + 2")
            .isEqualTo(12); // (3)
    }

    @Test
    void op_mult() {
        int T = 10;
        int U = 2;
        int R = new Sample().op(Sample.Operation.MULT,T,U);
        Assertions.assertThat(R).as("multiplication of 10 * 2")
            .isEqualTo(20);
    }

    @Test
    void fact_error() {
        int n = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> new Sample().fact(n));
    }

    @Test
    void fact_without_0() {
        int n = 0;
        Assertions.assertThat(new Sample().fact(n)).as("factoriel of 0").isEqualTo(1);
    }

    @Test
    void fact() {
        int n = 3;
        Assertions.assertThat(new Sample().fact(n)).as("factoriel of 3").isEqualTo(6);
    }
}
