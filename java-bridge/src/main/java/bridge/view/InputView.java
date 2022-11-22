package bridge.view;

import bridge.exception.CheckingException;
import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private final CheckingException CHECK_EXCEPTION = new CheckingException();

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println("다리의 길이를 입력해주세요.");
        String bridgeSize = Console.readLine();

        try {
            CHECK_EXCEPTION.isNumber(bridgeSize);
            return Integer.parseInt(bridgeSize);
        } catch (IllegalArgumentException ex) {
            System.out.println("[ERROR] 올바른 길이 값이 아닙니다.");
        }
        return -1;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String moveSpaceAnswer = Console.readLine();
        try {
            CHECK_EXCEPTION.isInputUorD(moveSpaceAnswer);
            return moveSpaceAnswer;
        } catch (IllegalArgumentException ex) {
            System.out.println("[ERROR] 올바른 입력 값이 아닙니다.");
        }

        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String retryAnswer = Console.readLine();

        try {
            CHECK_EXCEPTION.isInputRorQ(retryAnswer);
        } catch (IllegalArgumentException ex) {
            System.out.println("[ERROR] 올바른 입력 값이 아닙니다.");
        }


        return null;
    }
}
