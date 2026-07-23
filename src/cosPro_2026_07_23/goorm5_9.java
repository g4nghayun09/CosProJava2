package cosPro_2026_07_23;

import java.util.*;

class Main {
    public int[] solution(int[] score) {
        int[] answer = new int[score.length];
        int cnt = 1;
        for (int i = 0; i < score.length; i++) {
            cnt = 1;
            for (int j = 0; j < score.length; j++) {
                if (score[i] < score[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] score1 = {90, 87, 87, 23, 35, 28, 12, 46};
        int[] ret1 = sol.solution(score1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret1) + " 입니다.");

        int[] score2 = {10, 20, 20, 30};
        int[] ret2 = sol.solution(score2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret2) + " 입니다.");
    }
}