package ex0824;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIThreadExam extends JFrame{//창역할을 Container라고 표현
	
	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);
	
	JButton btn1 = new JButton("눌러봐");
	
	public GUIThreadExam() {
		super("여기에 시계달거에요.");
		
		//JFrame의 레이아웃 변경
		super.setLayout(new FlowLayout());
		
		//component를 JFrame위에 올리기
		Container con = super.getContentPane();
		
		con.add(btn1);
		con.add(text1);
		con.add(text2);		
		
		//창크기 설정
		super.setSize(500, 400);
		
		//창정중앙에 위치하게 하기
		super.setLocationRelativeTo(null);
		
		//창띄우기
		super.setVisible(true);
		
		//x를 클릭했을때 프로그램 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//스레드 시작
		new NowTimeThread().start();
		
		new Thread(()->{
			for(int i = 0; i <= 1000; i++) {
				text1.setText(i+"");
				try {
					Thread.sleep((int)(Math.random()*100));
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		//버튼을 클릭하면 A~Z 출력
		btn1.addActionListener((e)->{
			System.out.println(111);
		});
	}//생성자 끝
	public static void main(String[] args) {
		new GUIThreadExam();
	}
}//클래스 끝

/*
 * 현재 시간을 구해서 JFrame Title에 1초마다 시간 갱신하는 스레드
 */

class NowTimeThread extends Thread{
	
	/*GUIThreadExam gui;
	
	NowTimeThread(GUIThreadExam gui){
		this.gui = gui;
	}*/
	@Override
	public void run() {
		
		while(true) {
		//현재시간구하기
		Calendar now = Calendar.getInstance();
		
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) +1;
		int d = now.get(Calendar.DATE);
		
		int h = now.get(Calendar.HOUR);
		int mm = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		StringBuilder sb = new StringBuilder();
		sb.append(y);
		sb.append("년 ");
		
		sb.append(m);
		sb.append("월 ");
		
		sb.append(d);
		sb.append("일 ");
		
		sb.append(h);
		sb.append("시 ");
		
		sb.append(mm);
		sb.append("분 ");
		
		sb.append(sec);
		sb.append("초 ");
		
		//JFrame의 Title에 시계 넣기
		
		GUIThreadExam.this.setTitle(sb.toString());
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}


