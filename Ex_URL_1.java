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
		String filePath = FilePath.FILE_PATH_8; // commom ��Ű��.File.Path.FILE_PATH_8 ���������
		String path = filePath + "/" + "index.html";
		String urlStr = "https://www.naver.com";
		try {
		URL ur = new URL(urlStr);
		System.out.println("ur >>> : " +ur);
		
		// ur.operStream() >>> : sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@4566e5bd
		System.out.println("ur.operStream() >>> : " + ur.openStream());
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(ur.openStream(), "UTF-8")); //���� �б����� �غ�
		BufferedWriter bw = new BufferedWriter(new FileWriter(path)); //���Ͼ������� �غ�
		
		//���ڵ� Ÿ��
		//UTF-8;
		//EUC-KR 
		//IOS-8859-1 
		System.out.println("br >>> : " + br);
		System.out.println("bw >>> : " + bw);
		String inLine = "";
		//������Ÿ���� String�� ���ڿ��� �о�ö��� -1�� ���� �ʰ� null������ ; �о���� �Լ��δ� read()�� readLine()���;
		while((inLine=br.readLine()) !=null ){
			System.out.println(inLine); // 
			bw.write(inLine);
		}
		bw.flush(); //bufferŬ�����η� ���ϛ����� �� flush() �Լ� ���ش�. 
		bw.close(); // Stream �� close
		br.close();//Stream �� close
		} catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}
	}
}
