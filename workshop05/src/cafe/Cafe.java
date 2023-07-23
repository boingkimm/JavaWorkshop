package cafe;

public class Cafe {

	// Cafe has a CoffeeList
	private Coffee [] coffeeList;    //- coffeeList:Coffee[]
	private int index;               //- index:int  //기본값0
	
	// 생성자 : 인스턴스 변수 초기화
	public Cafe() {   //기본생성자
		coffeeList = new Coffee[3];  //배열 초기화 (카페만들고 커피리스트만들기)
	}

	public int totalPrice() {
		int totalPrice = 0;   				 //1. totalPrice변수 없으니까 만들어주고
		for(Coffee coffee: coffeeList) {  	 //3. 중간에 변경하는 코드
			totalPrice += coffee.getPrice();
		}
		return totalPrice; 					 //2. 리턴
	}		
			
	public void setCoffee(Coffee coffee) {    //+ setCoffee(coffee:Coffee): void
		//coffee에 하나씩 넘어옴 (아메, 라떼,,)
		if(index == coffeeList.length) {  //3
			System.out.println("더 이상 저장할 수 없습니다");
		}else {
			coffeeList[index]=coffee;  //0번째 방부터 저장됨
			index++; //다음꺼 1번방, 그다음 2번방 - 최종 3
		}
	}		

	public Coffee[] getCoffeeList() {         //+ getCoffeeList() : Coffee[]
	 return coffeeList;
	}
}