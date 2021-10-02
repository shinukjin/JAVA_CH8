package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import a.b.c.common.FilePath;

public class Ex_URL_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = FilePath.FILE_PATH_8; // commom 패키지.File.Path.FILE_PATH_8 상수가져옴
		String path = filePath + "/" + "index.html";
		String urlStr = "https://www.naver.com";
		try {
		URL ur = new URL(urlStr);
		System.out.println("ur >>> : " +ur);
		
		// ur.operStream() >>> : sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@4566e5bd
		System.out.println("ur.operStream() >>> : " + ur.openStream());
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(ur.openStream(), "UTF-8")); //파일 읽기위한 준비
		BufferedWriter bw = new BufferedWriter(new FileWriter(path)); //파일쓰기위한 준비
		
		//인코딩 타입
		//UTF-8;
		//EUC-KR 
		//IOS-8859-1 
		System.out.println("br >>> : " + br);
		System.out.println("bw >>> : " + bw);
		String inLine = "";
		//데이터타입이 String인 문자열을 읽어올때는 -1로 하지 않고 null값으로 ; 읽어오는 함수로는 read()고 readLine()사용;
		while((inLine=br.readLine()) !=null ){
			System.out.println(inLine); // 
			bw.write(inLine);
		}
		bw.flush(); //buffer클래스로로 파일썻을시 꼭 flush() 함수 써준다. 
		bw.close(); // Stream 후 close
		br.close();//Stream 후 close
		} catch(Exception e) {
			System.out.println("에러가 >>> : " + e.getMessage());
		}
	}
}
