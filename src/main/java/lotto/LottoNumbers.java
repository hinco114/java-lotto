package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoNumbers {
    private final List<LottoNumber> lottoNumbers;

    public LottoNumbers() {
        this.lottoNumbers = new ArrayList<>();
    }

    public LottoNumbers(List<LottoNumber> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public LottoNumbers addLottoNumber(int number) {
        LottoNumbers newLottoNumbers = new LottoNumbers(new ArrayList<>(this.lottoNumbers));
        LottoNumber lottoNumber = new LottoNumber(number);
        newLottoNumbers.lottoNumbers.add(lottoNumber);
        return newLottoNumbers;
    }

    public int size() {
        return this.lottoNumbers.size();
    }
}
