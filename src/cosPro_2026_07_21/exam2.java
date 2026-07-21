package cosPro_2026_07_21;

import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 1000*arr.length;
        for(int i=0; i<arr.length;  i++) {
            int price = (((22-(arr[i]/100))*60)-(arr[i]%100))/10;
            answer += price * 500;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1400, 530, 2130};
        int ret = sol.solution(arr);

        System.out.println("solution 함수의 반환 값은 " + ret + " 입니다.");
    }
}