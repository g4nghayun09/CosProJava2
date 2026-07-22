package cosPro_2026_07_22;

import java.util.*;

class Main {
    public int solution(int[][] height) {

        int count = 0;
        int std = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height[i].length; j++) {
                boolean bool = true;
                std = height[i][j];
                if (i != 0 && height[i - 1][j] > std)
                    bool = false;
                if (i != height.length - 1 && height[i + 1][j] > std)
                    bool = false;
                if (j != 0 && height[i][j - 1] > std)
                    bool = false;
                if (j != height.length - 1 && height[i][j + 1] > std)
                    bool = false;

                if (bool)
                    count++;
            }
        }

        return count;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int[][] height = {{3, 6, 2, 8}, {7, 3, 4, 2}, {8, 6, 7, 3}, {5, 3, 2, 9}};
        int ret = sol.solution(height);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}