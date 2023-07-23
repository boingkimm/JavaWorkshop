package workshop03;

public class Test08 {

	public static void main(String[] args) {
	//1부터 100까지 반복하면서 3의 배수는 foo, 5의 배수는 bar, 7의 배수는 baz 값을 출력하는 프로그램을 작성하시오
		for(int n = 1; n <=100; n++) {
			System.out.print(n);
			if(n%3==0)System.out.print(" foo");
			if(n%5==0)System.out.print(" bar");
			if(n%7==0)System.out.print(" baz");
			System.out.println("");
		}
	}

}
