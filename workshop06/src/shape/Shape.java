package shape;

public abstract class Shape {

	private int width;
	private int heigth;
	private String colors;
	
	public Shape() {
	}

	public Shape(int width, int heigth, String colors) {
		this.width = width;
		this.heigth = heigth;
		this.colors = colors;
	}

	
	
	public abstract double getArea();  //도형의 넓이를 리턴

	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}


	public String toString() {
		return null;
	}
	
	
	
}
