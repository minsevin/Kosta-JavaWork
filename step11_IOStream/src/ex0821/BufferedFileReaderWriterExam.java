package ex0821;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedFileReaderWriterExam {
	
	public BufferedFileReaderWriterExam() {
		//문자단위로 파일을 읽기 / 쓰기(저장) -> Buffered이용
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			br = new BufferedReader(new FileReader("src/ex0820/a.txt"));
			//br.read();//한문자씩 읽기 아래 while문에 read를 사용함. read는 하나만 사용해야함.
			//a.txt파일을 문자단위로 읽기위해 reader를 사용하고 속도를 높히기 위해 buffer까지 사용.
			
			/*int i = 0;
			while((i = br.read()) != -1) {
				System.out.println(i+" = " + (char)i);
			}*///이건 단어 하나씩 읽기때문에 한줄씩 읽을려면 아래꺼를 써야함.
			
			//한줄씩 읽기
			String str = null;
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			
			//파일에 저장하기
			bw = new BufferedWriter(new FileWriter("src/ex0821/info.txt"));
			bw.write("쉬고싶지요?");
			bw.write("곧 쉬어요");
			
			bw.newLine();
			
			bw.write("즐거운 금요일\n");
			bw.write("주말에 푹쉬기");
			
			bw.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(br!=null)br.close();
			if(bw!=null)bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			
			}
		}
	}
	public static void main(String[] args) {
		new BufferedFileReaderWriterExam();
	}
}
