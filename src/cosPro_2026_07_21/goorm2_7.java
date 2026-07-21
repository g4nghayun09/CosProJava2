//package cosPro_2026_07_21;
//
//class Main {
//    public int solution(int value, String unit) {
//       // [[(guide - anchor):(// 한줄을 수정하시오)]]
//        int converted = 0;
//        if (unit.equals("C"))
//            converted = (int) (value * 1.8 + 32);
//        if (unit.equals("F"))
//            converted = (int) ((value - 32) / 1.8);
//        return converted;
//    }
//
//    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
//    public static void main(String[] args) {
//        Main sol = new Main();
//        int value = 527;
//        String unit = "C";
//        int ret = sol.solution(value, unit);
//
//        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
//        value = 980;
//        unit = "F";
//        ret = sol.solution(value, unit);
//        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
//    }
//}
