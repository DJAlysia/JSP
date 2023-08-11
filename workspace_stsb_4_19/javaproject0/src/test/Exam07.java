package test;
import java.util.Scanner;

public class Exam07 {

    public static void main(String[] args) {
    	
		// 입력 문자에 공백을 넣어서 입력하고
		// ad c d eed
		// 공백을 제거하고 출력하시오
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String input = scanner.nextLine();

        String withoutSpaces = input.replace(" ", "");

        System.out.println("공백 제거된 문자열: " + withoutSpaces);

        scanner.close();
    }
}
