package test;
import java.util.Scanner;

public class Exam03 {

    public static void main(String[] args) {
    	
		// str = 문자입력
		// num = 숫자입력
		// 숫자만큼 문자열을 출력하시오
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = scanner.nextLine();

        System.out.print("출력 횟수 입력: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }

        scanner.close();
    }
}
