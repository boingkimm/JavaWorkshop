package vehicle;

public class Truck extends Car {

	public Truck() {
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	
	////
	@Override
	public double getEfficiency() {      //부모에도 있는 메서드 - 재정의
		// 현재 적재 중량 5Kg 당 연비0.2Km 감소시킨 값을 리턴한다
//		return getEfficiency() - (getCarWeight()/5)*0.2;   //무한루프!
		return super.getEfficiency() - (getCarWeight()/5)*0.2;
	}

	
	@Override
	public void moving(int distance) {     //부모에도 있는 메서드 - 재정의
		// calcOil( )을 호출하여 오일 감소량을 획득하고, 잔여오일량에서 감소량을 뺀 새로운 잔여오일량으로 재설정한다.
		double oil = calcOil(distance);   //calcOil 호출 (오일감소량)
		double oil2 = getRestOil() - oil;  //잔여오일량 - 오일감소량
		setRestOil(oil2);   // 새로운 잔여오일량을 set.
	}

	private double calcOil(int distance) {
		//거리를 연비로 나누어 오일 소모량을 추출하고 리턴한다. 
		return distance/getEfficiency();     //트럭에도 getEff있으니까 super말고 트럭꺼 사용
	}


	public int getCost(int distance) {
		//calcOil( )을 호출하여 오일 감소량을 획득하고, 1L 당 3000원의 요금을 산정하여 리턴한다. 단, 소수점 이하는 버린다
		double oil = calcOil(distance);
		int cost = (int)(oil*3000);  // 오일이 더블이니까 int로 형변환
		return cost;
	}
	

	@Override
	public String toString() {   ////부모의 toString()에 연비를 추가하여 리턴한다.
		return super.toString() +"\t"+getEfficiency();
	}



}
