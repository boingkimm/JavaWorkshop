package workshop03;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// Scanner 클래스를 사용하여 키보드로 양의 정수값을 입력 받아서 자릿수를 출력하는 실습. 단 음수값 입력시 다시 입력 받는다.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수 구하기");

		int n;
		do {
			System.out.print("정수값：");
			n = scan.nextInt();
		} while (n <= 0);

		int no = 0;
		while (n > 0) {
			n /= 10;
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");

	}

}
