package workshop03;

public class Test14 {

	public static void main(String[] args) {
		// 반복문을 사용하여 실행결과와 같이 출력되도록 코드를 구현하시오

		System.out.println("----- 곱셈표 -----");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		}
	}

}
