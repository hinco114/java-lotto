package lotto;

public class LottoNumber {
    public static int MIN_LOTTO_NUMBER = 1;
    public static int MAX_LOTTO_NUMBER = 45;
    private int number;

    public LottoNumber(int number) {
        if (number < MIN_LOTTO_NUMBER || number > MAX_LOTTO_NUMBER) {
            throw new IllegalArgumentException("로또 숫자의 범위는 " + MIN_LOTTO_NUMBER + "~ " + MAX_LOTTO_NUMBER + "입니다.");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
