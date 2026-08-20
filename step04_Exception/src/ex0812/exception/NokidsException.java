package ex0812.exception;

public class NokidsException extends Exception{
	static int count;
	public NokidsException(){
		super("애들은 안돼요.");
		count++;
	}
	
	NokidsException(String message){
		super(message);
		count++;
	}

}


