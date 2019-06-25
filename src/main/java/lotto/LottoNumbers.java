package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LottoNumbers {
    private final List<LottoNumber> lottoNumbers;

    public LottoNumbers() {
        this.lottoNumbers = new ArrayList<>();
    }

    private LottoNumbers(List<LottoNumber> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public static LottoNumbers from(List<Integer> integers) {
        List<LottoNumber> lottoNumbers = integers.stream()
                .map(LottoNumber::new)
                .collect(Collectors.toList());
        return new LottoNumbers(lottoNumbers);
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
