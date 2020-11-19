package Sub1;

public class Banana {

	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country=country;
		this.price = price;
	}
	
	
	public void show() {
		System.out.println("원산지 :"+country);
		System.out.println("가격 :"+price);
	}
	
	@Override
	public String toString() {
		show();
		return super.toString();
		
	}

}
