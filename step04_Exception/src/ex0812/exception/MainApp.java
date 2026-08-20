package ex0812.exception;

import java.util.Random;

public class MainApp {
	public static void main(String [] args) {
		System.out.println("***ShoppingMall OPEN***");
		
		ShoppingMall mall = new ShoppingMall();
		
		Random r =new Random();
		
		for(int i=0; i<10; i++) {
			
			int age = r.nextInt(55)+1;
			try {
				mall.enter(age);
			}catch (NokidsException e) {
				System.out.println(e.getMessage());
				
			}
			System.out.println();
			
		}
		System.out.println("***ShoppingMall CLOSE***");
		
		System.out.println("예외갯수 = " +NokidsException.count);
	}

}
