package student;

public class Student {

// =====변수=====
	
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
// =====생성자=====
	
		public Student() {   //기본생성자
	}

		public Student(String name, int korean, int english, int math, int science) {  //파라미터가진 생성자
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
			this.science = science;
		}

// =====메서드=====
		
		public double getAvg() {      //getGrade에서만 쓰이니까 private으로 처리하면 좋음.
			double sum = korean + english + math + science;
			return sum/4;
		}
		
		public String getGrade() {
//			double avg = getAvg();  //실수
			int avg = (int)getAvg(); //정수로 형변환
			String grade = null;     // String grade = null;
									 // return grade;
			if(avg >= 90) {
				grade = "A학점";
			}else if(avg >= 70) {
				grade = "B학점";
			}else if(avg >= 50) {
				grade = "C학점";
			}else if(avg >= 30) {
				grade = "D학점";
			}else {
				grade = "F학점";
			}
			
			return grade;
		}
			
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getKorean() {
			return korean;
		}

		public void setKorean(int korean) {
			this.korean = korean;
		}

		public int getEnglish() {
			return english;
		}

		public void setEnglish(int english) {
			this.english = english;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int math) {
			this.math = math;
		}

		public int getScience() {
			return science;
		}

		public void setScience(int science) {
			this.science = science;
		}

	
}
