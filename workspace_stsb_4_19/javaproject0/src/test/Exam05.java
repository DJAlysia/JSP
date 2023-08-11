package test;
import java.util.Random;

public class Exam05 {

    public static void main(String[] args) {
    	
		// 1~9 까지 랜덤한 숫자를 발생한다
		// a = 랜덤 값
		// a * 1
		// a * 2 ... 숫자를 증가하면서 5번 반복하면 결과 출력
    	
        Random random = new Random();

        int a = random.nextInt(9) + 1;

        System.out.println("랜덤한 숫자: " + a);

        for (int i = 1; i <= 5; i++) {
            int result = a * i;
            System.out.println(a + " * " + i + " = " + result);
        }
    }
}
