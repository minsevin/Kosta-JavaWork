package step05_Lamda;

public class MainApp {
	public static void main(String[] args) {
		//1.기존방식
		/*AInterface ai = new Test();
		ai.aa();*/
		
		//2.익명의 이너클래스(AnonymouseInnerclass) 타입으로 작성
		/*AInterface ai = new AInterface() {
			@Override
			public void aa() {
				System.out.println("익명의 이너클래스(AnonymouseInnerclass) aa호출");
				
			}
		};//AInterface end
		
		ai.aa();*/
		
		//3.람다식
		//람다식은 반드시 interface안에 메소드 한개 있을 경우에사용 할 수 있다.
		//FunctionalInterface라고 한다.
		//문법
		//1)인수가 없는 경우
		//() -> {}
		//
		//2)인수가 있는 경우
		//(변수이름,...) -> {}
		//
		//3)기능이 한문장인 경우
		//() -> 기능
		AInterface ai = ()->System.out.println("인수 없는 람다식..");
		ai.aa();
		//////////////////////////////////////////////////////////
		BInterface bi = (a)->System.out.println(a+"가 전달된 람다식");
		bi.bb(7);
		//////////////////////////////////////////////////////////	
		CInterface ci = (a,b)->{
			return a+b;
		};
		int re = ci.cc(5, 8);
		System.out.println("re = " +re);
		//위처럼 syso를 쓰지못하고 {}안에 return을 넣은 이유는 문장이 2개 이기때문에 못하는 것.
		//하는 방법은 아래와 같다.
		/*CInterface ci = (a,b)-> a+b;//문장이 한문장이면 자동으로 return으로 예상하고 적용되기에 a+b만 써도 된다.
		
		int re = ci.cc(5, 8);
		System.out.println("re = " +re);
		*/
	}//main end

}//class end
///////////////////////////////////////

class Test implements AInterface{
	@Override
	public void aa() {
		System.out.println("Test의 aa메소드 입니다.");
		
	}
	
}