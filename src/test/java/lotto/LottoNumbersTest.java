package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LottoNumbersTest {
    @Test
    @DisplayName("숫자들을 리스트로 입력받으면 LottoNumbers 가 생성된다")
    void constructor() {
        List<LottoNumber> lottoNumberList = new ArrayList<>();
        lottoNumberList.add(new LottoNumber(1));
        lottoNumberList.add(new LottoNumber(2));
        LottoNumbers lottoNumbers = new LottoNumbers(lottoNumberList);
    }
}
