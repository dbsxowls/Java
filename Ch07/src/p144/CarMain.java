
package p144;

public class CarMain {

	public static void main(String[] args) {
		
		Car tico = new Car();
		Car pride = new Car();
		
		tico.color = "White";
		tico.company = "DaeWoo";
		tico.type = "MiniCompact";
		
		pride.color = "Black";
		pride.company = "Kia";
		pride.type ="SubCompact";
		
		tico.go();
		pride.go();
		System.out.println(tico.color);
		System.out.println(tico.company);
		System.out.println(tico.type);
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
				
		
	}
	
}
