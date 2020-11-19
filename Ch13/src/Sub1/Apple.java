package Sub1;

public class Apple {
	
	private String country;
	private int price;
	
	public Apple(){
		this.country = "대한민국";
		this.price = 2000;		
	}
	
	
	
	public Apple (String country, int price) {
		this.country=country;
		this.price = price;
	}
	
	
	public void show() {
		System.out.println("원산지 :"+country);
		System.out.println("가격 :"+price);
	
	}
	
	public String toString() {
		show();
		return super.toString();
		
	}

}
