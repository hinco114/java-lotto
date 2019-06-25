package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoNumbers {
    private List<LottoNumber> lottoNumbers;

    public LottoNumbers() {
        this.lottoNumbers = new ArrayList<>();
    }

    private LottoNumbers(List<LottoNumber> lottoNumbers, LottoNumber lottoNumber) {
        this.lottoNumbers = lottoNumbers;
        this.lottoNumbers.add(lottoNumber);
    }

    public LottoNumbers addLottoNumber(int number) {
        LottoNumber lottoNumber = new LottoNumber(number);
        return new LottoNumbers(lottoNumbers, lottoNumber);
    }

    public int size() {
        return this.lottoNumbers.size();
    }
}
