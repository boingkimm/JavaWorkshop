package school;

import java.awt.font.TextAttribute;

public class StudentTest {

	public static void main(String[] args) {
		//main 함수 안에서 Student 타입의 배열을 선언하여 동작 시킨다
		
		//배열생성방법
		//1. new 이용
		Student studentArray [] = new Student[3];
		studentArray [0] = new Student("홍길동", 15, 171, 81);
 		studentArray [1] = new Student("한사람", 13, 183, 72);
 		studentArray [2] = new Student("임걱정", 16, 175, 65);
 		
 		//2. literal  - 권장
 		Student [] studentArray2 = { new Student("홍길동", 15, 171, 81),
							 		 new Student("한사람", 13, 183, 72),
							 		 new Student("임걱정", 16, 175, 65)};
 		
 		//3. new + literal
 		Student [] studentArray3 = new Student[] {new Student("홍길동", 15, 171, 81),
								 				  new Student("한사람", 13, 183, 72),
  								 				  new Student("임걱정", 16, 175, 65)};
 		
 		// 누적 - for문 밖에 
 		double totalAge = 0.0;  //로컬변수는 초기화 (0.0)
 		double totalHeight = 0.0;
 		double totalWeight = 0.0;
 		
 		
 		System.out.println("이름\t 나이\t 신장\t 몸무게");
 		for(Student stu:studentArray) {
 				System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getHeight()+"\t"+stu.getWeight());
// 				totalAge = totalAge + stu.getAge();  //반복하면서 누적됨
 				totalAge += stu.getAge();
 				totalHeight += stu.getHeight();
 				totalWeight += stu.getWeight();
  		}

 		System.out.println("\t");
 		System.out.println("나이의 평균: " + totalAge/3);   //14.666666666666666
 		
 		System.out.printf("나이의 평균: %.2f \n", totalAge/3);      //14.67 
 		System.out.printf("신장의 평균: %.2f \n", totalHeight/3);   //176.33 
 		
 		System.out.println(String.format("몸무게의 평균: %.2f \n", totalWeight/3));  //72.67
 		
	}
}
