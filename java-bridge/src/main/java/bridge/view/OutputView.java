package bridge.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(Map<String, List<String>> results) {
        printUpMap(results.get("up"));
        printDownMap(results.get("down"));
        System.out.println();
    }

    private void printUpMap(List<String> upResults) {
        System.out.print("[ ");
        for (int i = 0; i < upResults.size(); i++) {
            System.out.print(upResults.get(i));
            if (i < upResults.size() - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(" ]");
    }

    private void printDownMap(List<String> downResults) {
        System.out.print("[ ");
        for (int i = 0; i < downResults.size(); i++) {
            System.out.print(downResults.get(i));
            if (i < downResults.size() - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(boolean isWinning, int count, Map<String, List<String>> results) {
        System.out.println("최종 게임 결과");
        printMap(results);
        printWinningResult(isWinning);
        printCount(count);
    }

    private void printWinningResult(boolean isWinning) {
        if (isWinning) {
            System.out.println("게임 성공 여부: 성공");
            return;
        }
        System.out.println("게임 성공 여부: 실패");
    }

    private void printCount(int count) {
        System.out.println("총 시도한 횟수: " + count);
    }

    public void printStartMessage() {
        System.out.println("다리 건너기 게임을 시작합니다.\n");
    }
}
