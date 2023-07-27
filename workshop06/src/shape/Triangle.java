package shape;

public class Triangle extends Shape implements Resize {

	@Override
	public void setResize(int size) {  //세로(height)의 값에 size 값을 더한다
		int update = getHeigth() + size;
		setHeigth(update); //세로값을 업데이트
//		setHeigth(getHeigth() + size);
	}

	@Override
	public double getArea() {
		return (double)(getHeigth()*getWidth())/2;   //private 직접 접근 불가. 메서드로 접근.
	}


	public Triangle() {
	}

	public Triangle(int width, int heigth, String colors) {
		super(width, heigth, colors);
	}
	
}
