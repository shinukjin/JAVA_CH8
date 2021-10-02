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
		//���ڵ� Ÿ��
		//UTF-8
		//EUC-KR 
		//IOS-8859-1 
		System.out.println("br >>> : " + br);
		String inLine = "";
		//������Ÿ���� String�� ���ڿ��� �޾ƿö��� -1�� ���� �ʰ� null������ ; �о���� �Լ��δ� read()���� readLine()���;
		while((inLine=br.readLine()) !=null ){
			System.out.println(inLine);
		}
		br.close();//Stream �� close
		} catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}
	}
}
