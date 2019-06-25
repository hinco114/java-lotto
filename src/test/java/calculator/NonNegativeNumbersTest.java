package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NonNegativeNumbersTest {
    @Test
    @DisplayName("주어진 String List 로 생성된다")
    void constructor() {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        NonNegativeNumber nonNegativeNumber1 = new NonNegativeNumber(1);
        NonNegativeNumber nonNegativeNumber2 = new NonNegativeNumber(2);
        NonNegativeNumber nonNegativeNumber3 = new NonNegativeNumber(3);

        NonNegativeNumbers nonNegativeNumbers = new NonNegativeNumbers(strings);

        assertThat(nonNegativeNumbers.getPositiveNumbers())
                .contains(nonNegativeNumber1, nonNegativeNumber2, nonNegativeNumber3);
    }
}
