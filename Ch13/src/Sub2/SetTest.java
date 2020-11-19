package Sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜: 2020/11/18
 * 이름: 윤태진
 * 내용: Collection Set 실습하기 교재p337
 * 
 * 
 */
public class SetTest {
	public static void main(String[] args) {
		
	Set<Integer> set  = new HashSet<>();
	set.add(1);
	set.add(3);
	set.add(2);
	set.add(7);
	set.add(5);
	
	//Set 원소 갯수
	System.out.println("set 원소갯수:"+set.size());

	//Set 원소 출력(반복자를 이용)
	
	Iterator<Integer> iter = set.iterator(); 
	while(iter.hasNext()) {
		
		System.out.println("set 원소: "+iter.next());
		
		}	
	}

}
