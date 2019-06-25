package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class NonNegativeNumberTest {
    @Test
    @DisplayName("양수가 입력되면 인스턴스가 생성된다")
    void constructor() {
        NonNegativeNumber nonNegativeNumber = new NonNegativeNumber(NonNegativeNumber.MIN_NUMBER_INPUT);
        assertThat(nonNegativeNumber.getNumber()).isEqualTo(NonNegativeNumber.MIN_NUMBER_INPUT);
    }

    @Test
    @DisplayName("최소값 미만으로 생성시 오류")
    void constructor2() {
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> new NonNegativeNumber(NonNegativeNumber.MIN_NUMBER_INPUT - 1));
    }
}
