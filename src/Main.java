import java.util.*;

class Main {
    public int solution(int price, String grade) {
        int answer = 0;
        int discount = 0;
        if (grade.equals("S")) {
            discount = 5;
        } else if (grade.equals("G")) {
            discount = 10;
        } else if (grade.equals("V")) {
            discount = 15;
        }
        answer = 100*((discount/price)/price);
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);

        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);

        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}