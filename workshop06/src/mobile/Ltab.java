package mobile;

public class Ltab extends Mobile {

	public Ltab() {
	}

	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}


	@Override
	public int operate(int time) {
		//사용을 통해 배터리 감소 구현, 1분 사용 시 밧데리 10감소, 잔여 배터리 리턴
		int size = getBatterySize() - (time*10);
		setBatterySize(size);  //배터리사이즈를 사이즈로 설정
		return size;
	}


	@Override
	public int charge(int time) {
		//충전을 통한 배터리 증가 구현, 1분 충전 시 밧데리 10증가, 잔여 배터리 리턴
		int size = getBatterySize() + (time*10);
		setBatterySize(size);
		return size;
	}

	// private int batterySize; --> 직접 접근 불가. 메서드 통해서 접근한 것.
	
}
