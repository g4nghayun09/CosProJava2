//package cosPro_2026_07_21;
//
//class Main {
//    public String solution(String characters) {
//        //[[(guide-anchor):(// 한줄을 수정하시오)]]
//        String result = "";
//        result += characters.charAt(0);
//        for (int i = 1; i < characters.length(); i++) {
//            if (characters.charAt(i - 1) != characters.charAt(i))
//                result += characters.charAt(i);
//        }
//        return result;
//    }
//
//    // 아래는 테스트케이스 출력을 해보기 위한 main 함수입니다. solution 함수를 수정하세요.
//    public static void main(String[] args) {
//        Main sol = new Main();
//        String characters = "senteeeencccccceeee";
//        String ret = sol.solution(characters);
//
//
//        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
//    }
//}
