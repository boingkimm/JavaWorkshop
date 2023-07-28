package book;

public class Book {

	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	
	public Book() {
	}


	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public double getDiscountBookPrice() { //47500.0원
		double rate = bookDiscountRate*0.01;  //5.0 * 0.01 -> 0.05
		double price = bookPrice - (bookPrice * rate);
		return price;
	}

	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	public double getBookDiscountRate() {
		return bookDiscountRate;
	}


	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
}
