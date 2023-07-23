package mobile;

//추상클래스
public abstract class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {
	}

	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	//추상메서드
	public abstract int operate(int time);  //배터리 감소, 분단위
	public abstract int charge(int time);   //배터리 증가, 분단위
	

	
	
	
	
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
	
	
}
