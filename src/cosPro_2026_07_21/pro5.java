//package cosPro_2026_07_21;
//
//import java.util.*;
//
//class Main {
//    public int[] solution(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (right>left) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left += 1;
//            right -= 1;
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        Main sol = new Main();
//        int[] arr = {1, 4, 2, 3};
//        int[] ret = sol.solution(arr);
//
//        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
//    }
//}
//
