package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoNumbersTest {
    @Test
    @DisplayName("숫자들을 리스트로 입력받으면 LottoNumbers 가 생성된다")
    void constructor() {
        List<Integer> lottoNumberList = Arrays.asList(1, 2);
        LottoNumbers lottoNumbers = LottoNumbers.from(lottoNumberList);

        assertThat(lottoNumbers.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("로또 숫자를 추가 할 수 있다")
    void addLottoNumber() {
        LottoNumbers lottoNumbers = new LottoNumbers();
        LottoNumbers newLottoNumbers = lottoNumbers.addLottoNumber(1);

        assertThat(lottoNumbers.size()).isEqualTo(0);
        assertThat(newLottoNumbers.size()).isEqualTo(1);
    }
}
