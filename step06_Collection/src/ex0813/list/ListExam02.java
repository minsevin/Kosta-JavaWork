package ex0813.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListExam02{
	//List<Integer> list = new ArrayList<Integer>(5);
	//List<Integer> list = new ArrayList<Integer>();
	List<Integer> list = new Vector<Integer>();
	public ListExam02() {
		
		//데이터를 추가
		list.add(5);
		list.add(10);
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(8);
		list.add(9);
		
		
		//추가가 되었기때문에 몇개 저장했는지 알고싶다.
		System.out.println("저장된 객체의 개수 = " +list.size());
		
		//요소 꺼내기
		for(int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			System.out.println(value);

		}
		System.out.println("---개선된 for---");
		//개선된 for
		for(int i : list) {
			System.out.println(i);
		}
		System.out.println("this = "+list);//this.String()이 출력
		
		//제거
		list.remove(2);
		System.out.println("제거후 this = "+list);
		
		//정렬
		Collections.sort(list);
		System.out.println("정렬후 this = "+list);
		
		//내림차순으로 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("정렬후 this = "+list);
	}
	public static void main(String[] args) {
		new ListExam02();
	}
}
