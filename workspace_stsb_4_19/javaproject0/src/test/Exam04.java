package test;
import java.util.Scanner;

public class Exam04 {

    public static void main(String[] args) {
    	
		// 예를 들어 AbCdEf 처럼 입력하면
		// aBcDeF 로 변환해서 출력하시오
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String input = sc.nextLine();

        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                output.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                output.append(Character.toUpperCase(c));
            } else {
                output.append(c);
            }
        }

        System.out.println(output.toString());
        
        sc.close();
    }
}
