package workshop03;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * 다음의 for문을 while문으로 변경 하시오
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		*/
		
		int i = 0;
		while (i <= 10) {
			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
