package Sub4; 

/*
 * 날짜: 2020/11/11
 * 이름: 윤태진
 * 내용: 다형성 실습하기
 * 
 * 
 */
public class PolyusingTest {
	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
			
		Animal animal[] = {tiger, eagle, shark};
		
		animal[0].move();
		animal[0].hunt();
		
		animal[1].move();
		animal[1].hunt();
		
		animal[2].move();
		animal[2].hunt();
		
	}

}
