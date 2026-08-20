package step05_Lamda;
/*
 * @FunctionalInterface 는 메소드가 한개일때 선언한다.
 * 단 기능이 있는 default, static 이 있는 경우에도 쓸수 있다.
 */
@FunctionalInterface
public interface AInterface {
	void aa();//인수도 없고 return도 없음
	default void ff() {}

}
