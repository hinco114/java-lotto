package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class LottoNumberTest {
    @Test
    @DisplayName("로또 번호가 될 수 있는 숫자의 범위는 1 ~ 45 이다")
    void constructor() {
        LottoNumber minLottoNumber = new LottoNumber(LottoNumber.MIN_LOTTO_NUMBER);
        LottoNumber maxLottoNumber = new LottoNumber(LottoNumber.MAX_LOTTO_NUMBER);

        assertThat(minLottoNumber.getNumber()).isEqualTo(LottoNumber.MIN_LOTTO_NUMBER);
        assertThat(maxLottoNumber.getNumber()).isEqualTo(LottoNumber.MAX_LOTTO_NUMBER);
    }

    @Test
    @DisplayName("로또 번호가 될 수 없는 숫자의 범위는 IllegalArgumentException 발생")
    void constructor_invalid() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new LottoNumber(LottoNumber.MIN_LOTTO_NUMBER - 1));
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new LottoNumber(LottoNumber.MAX_LOTTO_NUMBER + 1));
    }
}
