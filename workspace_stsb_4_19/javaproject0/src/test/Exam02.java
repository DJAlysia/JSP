package test;
import java.util.Scanner;

public class Exam02 {

    public static void main(String[] args) {
	
    	// a = 정수입력
		// b = 정수입력
		// 두수의 합을 출력하시오
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력(a): ");
        int a = scanner.nextInt();

        System.out.print("두 번째 정수 입력(b): ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("두 수의 합은: " + sum);

        scanner.close();
    }
}
