//package cosPro_2026_07_21;
//
//class Solution {
//    public int func_a(int[] a, int length) {
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] >= length) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public int solution(int N, int[] orders) {
//        int price = 0;
//        for(int i=0; i<orders.length; i++){
//            price += orders[i];
//        }
//        price *= 3000;
//        return price;
//    }
//
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int N = 3;
//        int[] orders = {2, 6, 4, 8};
//        int ret = sol.solution(N, orders);
//
//        // 실행 결과 출력
//        System.out.println("solution 함수의 반환 값은 " + ret + " 입니다.");
//        // 60000
//    }
//}
