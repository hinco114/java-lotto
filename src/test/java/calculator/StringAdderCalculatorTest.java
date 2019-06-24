package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAdderCalculatorTest {
    @Test
    @DisplayName("추가적인 구분자가 있는 문자를 규칙에 맞게 합을 구한다")
    void calculate() {
        String input = "//;\n1;1;1:1:1,1,1";
        StringAdderCalculator stringAdderCalculator = new StringAdderCalculator(input);
        assertThat(stringAdderCalculator.calculate().getNumber()).isEqualTo(7);
    }

    @Test
    @DisplayName("추가적인 구분자가 없는 문자를 규칙에 맞게 합을 구한다")
    void calculate2() {
        String input = "1:1:1,1,1";
        StringAdderCalculator stringAdderCalculator = new StringAdderCalculator(input);
        assertThat(stringAdderCalculator.calculate().getNumber()).isEqualTo(5);
    }
}
