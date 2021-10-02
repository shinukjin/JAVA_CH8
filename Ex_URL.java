package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex_URL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String urlStr = "https://www.naver.com";
		try {
		URL ur = new URL(urlStr);
		System.out.println("ur >>> : " +ur);
		System.out.println("ur.operStream() >>> : " + ur.openStream());
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(ur.openStream(), "UTF-8"));
		//인코딩 타입
		//UTF-8
		//EUC-KR 
		//IOS-8859-1 
		System.out.println("br >>> : " + br);
		String inLine = "";
		//데이터타입이 String인 문자열을 받아올때는 -1로 하지 않고 null값으로 ; 읽어오는 함수로는 read()말고 readLine()사용;
		while((inLine=br.readLine()) !=null ){
			System.out.println(inLine);
		}
		br.close();//Stream 후 close
		} catch(Exception e) {
			System.out.println("에러가 >>> : " + e.getMessage());
		}
	}
}
