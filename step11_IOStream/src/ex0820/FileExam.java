package ex0820;

import java.io.File;

import javax.swing.JOptionPane;

public class FileExam {
    public FileExam() throws Exception{
    	String path = JOptionPane.showInputDialog("파일경로는?");
    	System.out.println(path);
    	File file = new File(path);//File은 무엇인가.
    	if(file.exists()) {//exists는 존재유무를 확인하는 명령어
    		System.out.println(path+"는 있습니다.^^");
    		
    		if(file.isDirectory()) {
    			System.out.println("폴더안에 정보를 확인 해볼게요!!");
    			String fileNames [] = file.list();
    			for(String fname : fileNames) {
    				System.out.println(fname);
    			}
    			
    		}else {
    			System.out.println("**파일의 정보를 확인해볼께요!!***");
    			System.out.println("file.canRead() = " + file.canRead());
    			System.out.println("file.canWrite() = " + file.canWrite());
    			System.out.println("file.length() = " + file.length());
    			System.out.println("file.getName() = " + file.getName());
    			System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
    			System.out.println("file.lastModified() = " + file.lastModified());
    			
    		}
    		
    	}else {
    		System.out.println(path+"가 없으니 생성할께요.");
    		//파일생성
    		//file.createNewFile();
    		
    		//폴더 생성
    		file.mkdir();
    		//파일생성과폴더생성은 동시에 못하기떄문에 따로따로 진행해줘야한다.
    	}
    	
    	
    }
	public static void main(String[] args)throws Exception {
		new FileExam();

	}

}
