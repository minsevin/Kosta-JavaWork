package ex0812.exception;

public class ShoppingMall {
	public void enter(int age)throws NokidsException {
		if(age < 18) {
			//try {
			throw new NokidsException("성인만오세요.");
			//}catch (NokidsException e) {
			//	System.out.println(e.getMessage());
			//}
		}else {
			System.out.println(age+"살 님 환영해요.");
		}
	}
}
