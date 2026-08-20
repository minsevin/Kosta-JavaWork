package ex0810.abstract_final;

abstract class Animal{//안에 abstract을 선언하면 abstract class로 선언해야함.
	int legs;
	public abstract void sound();
	//기능을 명확하게 정의할수 없을때 abstract 사용
	//ex)동물의 소리.
	public abstract void run();
	public void eat() {
		System.out.println("잘 먹는다!");
	}
}

/*abstract*/ class Dog extends Animal {//abstract을 써야하지만 쓰게되면 생성불가이기때문에 옆에처럼 표현.
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	@Override
	public void run() {
		System.out.println("잘 뛴다.");
	}
	
}
class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	@Override
	public void run() {
		System.out.println("잘 뛰고 잘 올라간다");
		
	}
}
class Pig extends Animal{

	@Override
	public void sound() {
		System.out.println("꿀꿀");
		
	}

	@Override
	public void run() {
		System.out.println("못 뛴다.");
		
	}
	@Override
	public void eat() {
		System.out.println("모든 것들을 잘 먹는다.");
	}
	
}
public class AbstractExam {
	//매개변수를 이용한 다형성
	public static void test(Animal animal) {//Cat or Dog or Pig Animal animal=??
		//각 동물의 메소드 호출. 메소드가 다 똑같기 때문에 각자 호출하는게 아니라 하나만 호출하면된다.
		animal.sound();
		animal.eat();
		animal.run();
		System.out.println("-------------------------------------");
		
	}

	public static void main(String[] args) {
		Animal an = null;
		
		an = new Dog();//필드를 이용한 다형성
		test(an);
		
		an = new Cat();
		test(an);
		
		an = new Pig();
		test(an);

	}

}

