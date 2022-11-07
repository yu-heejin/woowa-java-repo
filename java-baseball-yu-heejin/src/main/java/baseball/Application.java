package baseball;

public class Application {
    public static void main(String[] args) {
        // 게임 객체 인스턴스화
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame();
        CheckValidArgument checkValidArgument = new CheckValidArgument();

        // 게임 시작
        numberBaseballGame.gameStart();
        // 게임 지속 여부 가져오기
        int goGameAnswer = numberBaseballGame.getGoGameAnswer();

        while (goGameAnswer == 1) {
            // 숫자 입력
            String number = numberBaseballGame.inputNumber();

            // 예외 처리 1 : 올바른 숫자가 입력됐는가?
            checkValidArgument.isNumber(number);
            // 예외 처리 2 : 숫자가 세자리 숫자인가?
            checkValidArgument.isMaxSize(number);

            // 입력한 숫자를 기반으로 게임 결과 계산하기
            numberBaseballGame.countGameResults();
            // 게임 결과 출력하기
            numberBaseballGame.printGameResult();
            // 게임 지속 여부 가져오기
            goGameAnswer = numberBaseballGame.getGoGameAnswer();
        }
    }
}