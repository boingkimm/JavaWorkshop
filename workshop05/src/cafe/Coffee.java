package cafe;

public class Coffee {

	private String name;
	private int price;

	public Coffee() {
	}

	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {   //Coffee 객체의 모든 정보를 조합하여 리턴한다. 
		return name + " " + price;
	}

}

