package cafe;

public class CafeTest {

	public static void main(String[] args) {

		Cafe cafe = new Cafe();
		 
		 // Coffee 객체를 3개 생성하고, setCoffee()이용하여 Coffee 배열에 넣는다.
		 // Coffee 배열에 있는 객체 정보를 모두 출력 한다 – for 문을 이용 할 것
		 // Coffee 가격의 합을 출력 한다

		 Coffee c1 = new Coffee("Americano", 4000);
		 Coffee c2 = new Coffee("Caffelatte", 5000);
		 Coffee c3 = new Coffee("Macchiato", 6000);
		 
		 //Cafe의 setCoffee에 전달
		 cafe.setCoffee(c1);
		 cafe.setCoffee(c2);
		 cafe.setCoffee(c3);
		 
		 //배열
		 Coffee [] coffeeList = cafe.getCoffeeList();
		 
		 for(Coffee coffee: coffeeList) {
			 System.out.println(coffee.toString());
		 }

		 System.out.println(String.format("커피 가격의 합 : %d원", cafe.totalPrice()));
		 System.out.printf("커피 가격의 합 : %d원\n" , cafe.totalPrice());
		 
	}
}
