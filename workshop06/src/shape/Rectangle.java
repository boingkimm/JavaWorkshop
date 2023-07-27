package shape;

public class Rectangle extends Shape implements Resize {
	
	@Override
	public void setResize(int size) {  //가로(width)의 값에 size 값을 더한다
		int update = getWidth() + size;
		setWidth(update);
	}

	@Override
	public double getArea() {
		return (double)(getHeigth()*getWidth());
	}

	public Rectangle() {
	}

	public Rectangle(int width, int heigth, String colors) {
		super(width, heigth, colors);
	}

	
	
}
