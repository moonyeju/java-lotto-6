package lotto;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        int purchaseAmount = getPurchaseAmount();
        int lottoCount = purchaseAmount / 1000;
        List<List<Integer>> allLottoNumbers = generateLottoNumbers(lottoCount);
        printAllLottoNumbers(allLottoNumbers,lottoCount);
    }

    private static List<List<Integer>> generateLottoNumbers(int lottoCount) {
        List<List<Integer>> allLottoNumbers = new ArrayList<>();
        for (int i = 0; i < lottoCount; i++) {
            List<Integer> lottoNumbers = generateUniqueLottoNumbers();
            Collections.sort(lottoNumbers); // 번호 정렬
            allLottoNumbers.add(lottoNumbers); // 리스트에 추가
        }
        return allLottoNumbers;
    }

    private static List<Integer> generateUniqueLottoNumbers() {
        List<Integer> lottoNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        return lottoNumbers;
    }

    private static int getPurchaseAmount() {
        while (true) {
            try {
                System.out.println("구입금액을 입력해 주세요.");
                int purchaseAmount = Integer.parseInt(Console.readLine());
                validatePurchaseAmount(purchaseAmount);
                return purchaseAmount;
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 숫자를 입력해 주세요.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void validatePurchaseAmount(int purchaseAmount) {
        if (purchaseAmount % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 1000원 단위로 입력해 주세요.");
        }
    }

    private static void printAllLottoNumbers(List<List<Integer>> allLottoNumbers,int lottoCount) {
        System.out.println(lottoCount+"개를 구매했습니다.");
        for (List<Integer> lottoNumbers:allLottoNumbers) {
            System.out.println(lottoNumbers);
        }
    }
}
