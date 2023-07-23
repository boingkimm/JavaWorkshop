package vehicle;

public class Car extends Vehicle {

	private double restOil;
	private int carWeight;
	
	public Car() {
	}

	public Car(int maxWeight, double oilTankSize, double efficiency) {
		 super(maxWeight, oilTankSize, efficiency);
	}

    ////
	
	public void addOil(int oil) {  //현재 오일량에 추가한다. 단, 오일탱크크기를 넘어서면 안된다. 
		if((restOil+oil) <= getOilTankSize()) {  //Vehicle에서 상속받은 getOilTankSize()
			restOil += oil;  					 //현재오일restOil에 oil추가, 누적.
		}
	}
	
	public void moving(int distance) {  //연비와 주행거리에 따라 오일량을 감소 시킨다. 
		// distance / 연비
		restOil -= (distance/getEfficiency());
	}
	
	public void addWeight(int weight) {  // 현재 적재량에 물건(weight)을 추가한다. 단, 최대적재중량을 넘어서면 안된다. 
		if(weight <= getMaxWeight()) {
			carWeight += weight;
		}
	}
	
	
	////
	
	public double getRestOil() {  //현재오일량 조회
		return restOil;
	}


	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCarWeight() {
		return carWeight;
	}

	public void setCarWeight(int carWeight) {
		this.carWeight = carWeight;
	}

	
	//// 
	
	@Override   //override에서 toString선택하기! (Generate X)
	public String toString() {   ////부모의 toString()에 잔여오일량과 현재적재중량을 추가하여 리턴한다.
		return super.toString() +"\t"+restOil+"\t"+carWeight ;  //super없으면 무한루프!
				
	}
	

	
	
	
}
