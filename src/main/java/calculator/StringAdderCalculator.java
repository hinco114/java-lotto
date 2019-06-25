package calculator;

public class StringAdderCalculator {
    private NonNegativeNumbers nonNegativeNumbers;

    public StringAdderCalculator(String input) {
        StringParser stringParser = new StringParser(input);
        nonNegativeNumbers = stringParser.parseByDelimiter();
    }

    public NonNegativeNumber calculate() {
        int sum = nonNegativeNumbers.getPositiveNumbers()
                .stream()
                .mapToInt(NonNegativeNumber::getNumber)
                .sum();
        return new NonNegativeNumber(sum);
    }
}
