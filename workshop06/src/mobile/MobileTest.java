package mobile;

public class MobileTest {

	public static void main(String[] args) {
		 // 각각의 Mobile 객체를 생성한다.
		 // 생성된 객체의 정보를 출력한다.
		 // 각각의 Mobile 객체에 10분씩 충전을 한다. 
		 // 10분 충전 후 객체 정보를 출력한다.
		 // 각각의 Mobile 객체에 5분씩 통화를 한다.
		 // 5분 통화 후 객체 정보를 출력한다.
		

//Check		System.out.println(ltab);   //투스트링 사용하면 안되는지 해보기 (Vehicle 참고)

		
		Ltab ltab = new Ltab("Ltab", 500, "AP-01");
		Otab otab = new Otab("Otab", 1000, "AND-20");
		
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("------------------------------------");
		
		System.out.println(ltab.getMobileName() + " \t "
				+ ltab.getBatterySize() + " \t " + ltab.getOsType());
		System.out.println(otab.getMobileName() + " \t "
				+ otab.getBatterySize() + " \t " + otab.getOsType());
		
		ltab.charge(10);
		otab.charge(10);
		
		System.out.println();
		System.out.println("10분 충전");
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("------------------------------------");
		
		System.out.println(ltab.getMobileName() + " \t "
				+ ltab.getBatterySize() + " \t " + ltab.getOsType());
		System.out.println(otab.getMobileName() + " \t "
				+ otab.getBatterySize() + " \t " + otab.getOsType());
		
		ltab.operate(5);
		otab.operate(5);
		
		System.out.println();
		System.out.println("5분 통화");
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("------------------------------------");
		
		System.out.println(ltab.getMobileName() + " \t "
				+ ltab.getBatterySize() + " \t " + ltab.getOsType());
		System.out.println(otab.getMobileName() + " \t "
				+ otab.getBatterySize() + " \t " + otab.getOsType());
	}

}
