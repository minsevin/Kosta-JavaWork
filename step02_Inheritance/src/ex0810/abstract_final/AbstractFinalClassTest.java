package ex0810.abstract_final;//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{//상속불가, 생성가능->final
 final int i = -999999; //값변경불가
}


abstract class AbstractClassExam{//상속가능, 생성불가->abstract
    abstract String abstractMethodExam(int i,String s);//body({})가 없다. 재정의를 위해서 만든다.->abstract
    final int finalMethodExam(int i, int j){ //재정의불가->final
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	//int finalMethodExam(int i, int j){//부모코드인 abstract을 재정의 할 수 없는걸 재정의할려고 하기때문에 불가능
		//return i*j;
	//}
	
}

class Sample02 /*extends FinalClassExam*/{  }//상속받을수 없는 코드이기때문에 주석처리


 
abstract class Sample03 extends AbstractClassExam{ //class 앞에 abstract 붙혀야함.
	 String abstractMethodExam(int i,String s){
		return s+i;
	 }
	abstract String abstractMethodExam(String s,int i);    

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace /*= new AbstractClassExam()*/; //생성이 되지 않는 코드이기에 생성불가.
		FinalClassExam fce = new FinalClassExam();
		//fce.i=100000;//final 필드는 값을 변경하지 못하기 때문에 주석처리
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
