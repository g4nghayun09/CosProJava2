package cosPro_2026_07_23;

import java.util.*;

public class Main {
    public int solution(String[][] cards) {

        boolean bool = false;
        int red = 0;
        int blue = 0;
        int black = 0;

        for (int i = 0; i < cards.length; i++) {

            if (cards[i][0].equals("red")) {
                if (red != 0) {
                    bool = true;
                }
                red += Integer.parseInt(cards[i][1]);
            }
            if (cards[i][0].equals("blue")) {
                if (blue != 0) {
                    bool = true;
                }
                blue += Integer.parseInt(cards[i][1]);
            }
            if (cards[i][0].equals("black")) {
                if (black != 0) {
                    bool = true;
                }
                black += Integer.parseInt(cards[i][1]);
            }
        }


        int answer = red + blue + black;
        if (bool) {
            answer = 2 * (red + blue + black);
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String[][] cards1 = {{new String("blue"), new String("2")}, {new String("red"), new String("5")}, {new String("black"), new String("3")}};
        int ret1 = sol.solution(cards1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[][] cards2 = {{new String("blue"), new String("2")}, {new String("blue"), new String("5")}, {new String("black"), new String("3")}};
        int ret2 = sol.solution(cards2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}