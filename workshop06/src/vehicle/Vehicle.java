package vehicle;

public class Vehicle {  //부모부터 차례로 작성하는 것이 좋음

	private int maxWeight;
	private double oilTankSize;
	private double efficiency;

	////
	public Vehicle() {
	}

	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}
	

	////
	
	public int getMaxWeight() {
		return maxWeight;
	}


	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}

	////
	
	@Override
	public String toString() {    //최대적재량과 오일탱크크기를 문자열로 리턴한다.
		return maxWeight+"\t"+oilTankSize;
	}
	
}


