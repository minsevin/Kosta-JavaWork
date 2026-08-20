package ex0810.superkeyword;

class Animal{//부모코드
	int age = 5;
	String bodyColor;
	
	public void sound() {
		System.out.println("super의 sound call");
	}
	public void eat() {
		System.out.println("super의 eat call");
	}
}

class Cat extends Animal{//자식코드. cat is a Animal 성립.
	int age = 10;//부모코드와 같은 메소드 지정.
	int weight;
	//sound를 재정의 할려고 하는데 간단하게 빠르게 코드를 작성하려면 
	//sound의 앞글자인 s를 입력, ctrl + space를 누르면 아래와 같이 작성해줌.
	public void sound() {//재정의 하기 위해선 부모코드와 동일하게 변수 지정.
		System.out.println("Cat의 sound call...");
	}
	public void run() {
		System.out.println("Cat의 run call...");
	}
	public void test() {
		System.out.println(age);//자식코드호출
		System.out.println(this.age);//자식코드호출
		System.out.println(super.age);//부모코드호출
		
		System.out.println("-------------------");
		
		System.out.println(bodyColor);//부모코드호출
		System.out.println(this.bodyColor);//부모코드호출
		System.out.println(super.bodyColor);//부모코드호출
		
		System.out.println("-------------------");
		System.out.println(weight);//자식코드호출
		System.out.println(this.weight);//자식코드호출
		//System.out.println(super.weight);
		//error이유는 super는 부모쪽을 지정해서 호출하는데 weight은 자식코드에 있기 때문에 불러올수가 없다.
		
		System.out.println("====메소드 호출=====");
		
		sound();//자식코드호출
		this.sound();//자식코드호출
		super.sound();//부모코드호출
		System.out.println("-------------------");
		
		eat();//부모코드호출
		this.eat();//부모코드호출
		super.eat();//부모코드호출
		System.out.println("-------------------");
		
		run();//자식코드호출
		this.run();//자식코드호출
		//super.run();//부모코드에 run이 없고 자식코드에 있기때문에 super는 사용불가능 오류발생.
		System.out.println("-------------------");
	}
}

public class InheristanceFieldMethodExam {

	public static void main(String[] args) {
		//Cat cat = new Cat();
		//cat.test();
		Cat cat = new Cat();
		System.out.println("--외부에서 객체 생성 접근--");
		System.out.println(cat.age);
		System.out.println(cat.bodyColor);
		System.out.println(cat.weight);
		
		cat.sound();
		cat.eat();
		cat.run();
		
		System.out.println("---------다형성----------");
		Animal an = new Cat();//부모부분만 접근가능하다. 단 재정의된 메소드는 자식코드만 접근가능하다. 
		System.out.println(an.age);
		System.out.println(an.bodyColor);
		//System.out.println(an.weight);//weight는 자식부분에만 있기때문에 호출할려면 casting 필요.
		
		an.sound();//재정의된 메소드는 부모타입이라도 자식코드에서 재정의된 메소드가 호출된다.
		an.eat();
		//an.run(); // casting 필요.
		
		System.out.println("an="+an);
		
		/*if(an instanceof Cat) {
		Cat c = (Cat)an; //상속관계이기때문에 casting 가능 -> ObjectDownCasting
		System.out.println("c="+c);
		//그러기에 위에서 error떴던 두 코드가 출력가능하게 바뀐다.
		System.out.println(c.weight);
		c.run();
		}*/
		if(an instanceof Cat c) {// 추가된 문법으로 왼쪽처럼 쓰면 Cat c = (Cat)an;을 생략가능하다.
		
		System.out.println("c="+c);
		System.out.println(c.weight);
		c.run();
		}

	}

}

