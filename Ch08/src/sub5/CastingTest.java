package sub5;

/*
 * 날짜: 2020/11/11 
 * 이름: 윤태진 
 * 내용: 캐스팅(객체변환) 실습하기
 */

public class CastingTest {
	public static void main(String[]args){
		
		//캐스팅
		int num1 =1;
		double num2 = num1;
	
		double var1 = 1.12;
		int    var2 = (int) var1;
		
		//업캐스팅(다형성 적용)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		//다운캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		//instanceof: 참조변수(객체) 의 실제 객체를 조사하는 연산자
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}else if(a1 instanceof Eagle) {
			System.out.println("a2은 Eagle 입니다.");
		}else if(a1 instanceof Shark) {
			System.out.println("a3은 Shark 입니다.");
		}
		
		
		
	}

}
