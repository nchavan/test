package org.nc.algo.data.structures.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverseStrUsingByteArray() {
    }

    @ParameterizedTest
    @MethodSource("provideData")
    public void reverseInt(int input, int expected) {
        ReverseInteger reverseInteger = new ReverseInteger();

        int output = reverseInteger.reverse(input);

        Assertions.assertThat(output)
                .isEqualTo(expected);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(1234, 4321),
                Arguments.of(12, 21)
        );
    }
}