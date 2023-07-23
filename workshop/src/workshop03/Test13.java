package workshop03;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		// Scanner 클래스를 사용하여 키보드로 2자리의 양의 정수값을 입력 받아서 출력하는 실습. 단 2자리 양의 정수가 아니면 다시 입력 받는다.

		Scanner scan = new Scanner(System.in);
		int no;

		System.out.println("2자리의 정수를 입력하세요.");

		do {
			System.out.print("입력：");
			no = scan.nextInt();
		} while (no < 10 || no > 99);

		System.out.println("입력값은 " + no );
		
	}

}
