# 구현할 기능 목록

### 로또 구입 금액 입력

- 1000원 단위로 입력 받는다.
- 1000원 단위로 나누어 떨어지지 않는 경우 예외처리한다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, **"[ERROR]"**로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
    - `Exception`이 아닌 `IllegalArgumentException`, `IllegalStateException` 등과 같은 명확한 유형을 처리한다.
- 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.

### 발행한 로또 수량에 해당하는 자동 로또 번호 생성

- 로또 1장의 가격은 1,000원이다.
- 입력받은 로또 구입 금액에 해당하는 만큼 로또를 발행한다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
- 로또 번호의 숫자 범위는 1~45까지이다.
- Random 값 추출은 `camp.nextstep.edu.missionutils.Randoms`의 `pickUniqueNumbersInRange()`를 활용한다.

### 당첨 번호 입력

- 당첨번호를 쉼표를 기준으로 구분해서 입력 받는다.
- 중복되지 않는 숫자를 입력해야만 한다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, **"[ERROR]"**로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
    - `Exception`이 아닌 `IllegalArgumentException`, `IllegalStateException` 등과 같은 명확한 유형을 처리한다.
- 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.

### 보너스 번호 입력

- 보너스번호를 입력 받는다.
- 당첨번호와 중복되지 않는 숫자를 입력해야만 한다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, **"[ERROR]"**로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
    - `Exception`이 아닌 `IllegalArgumentException`, `IllegalStateException` 등과 같은 명확한 유형을 처리한다.
- 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.

### 로또 게임 기능 구현

- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000원
- 발행한 로또 중 당첨 내역을 출력한다.
    - 1,2개 일치한 경우 당첨내역에 포함하지 않는다.
    - 3개, 4개, 5개, 5개+보너스 볼, 6개 순으로 당첨내역을 출력한다.
- 총 수익률을 출력한다.
    - 소수점 둘째자리에서 반올림한다.