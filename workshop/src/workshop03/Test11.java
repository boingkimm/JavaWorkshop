package workshop03;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		/*
		Scanner 클래스를 사용하여
		키보드로 두 개의 정수값을 입력 받아서 a와 b 변수에 저장하고 b-a 값을 출력.
		단 b변수값이 a 변수값보다 작으면 b변수값을 다시 입력 받는다
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("a의 값：");
		int a = scan.nextInt();

		int b=0;
		while (true) {
			System.out.print("b의 값：");
			b = scan.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");
		
		
	}
}
