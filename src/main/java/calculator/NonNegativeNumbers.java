package calculator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NonNegativeNumbers {
    private List<NonNegativeNumber> positiveNumbers;

    public NonNegativeNumbers(List<String> strings) {
        positiveNumbers = strings.stream()
                .map(string -> new NonNegativeNumber(Integer.parseInt(string)))
                .collect(Collectors.toList());
    }

    public List<NonNegativeNumber> getPositiveNumbers() {
        return Collections.unmodifiableList(positiveNumbers);
    }
}
