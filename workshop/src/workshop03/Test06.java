package workshop03;

public class Test06 {

	public static void main(String[] args) {
	// 세 개의 주사위를 던졌을 때, 눈의 곱이 3의 배수인 값을 출력하는 프로그램을 작성하시오
		for(int n1 = 1; n1 <= 6; n1++) {
			for(int n2 = 1; n2 <= 6; n2++) {
				for(int n3 = 1; n3 <= 6; n3++) {
					if((n1*n2*n3)%3 == 0) {
						System.out.println(n1 + "*" + n2 + "*" + n3 + "=" + (n1*n2*n3));
					}
				}
			}
		}
	}

}
