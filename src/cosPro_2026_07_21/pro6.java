//package cosPro_2026_07_21;
//
//class Main {
//    public int solution(int number) {
//        int count = 0;
//        for (int i = 1; i <= number; i++) {
//            int current = i;
//            int temp = count;
//            while (current != 0) {
//                if ((current % 10) == 3 || (current % 10) == 6 || (current % 10) == 9){
//                    count++;
//                }
//                current /= 10;
//            }
//        }
//        return count;
//    }
//
//    // 아래는 테스트케이스 출력을 해보기 위한 main 함수입니다.
//    public static void main(String[] args) {
//        Main sol = new Main();
//        int number = 40;
//        int ret = sol.solution(number);
//
//        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
//    }
//}
