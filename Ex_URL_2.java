package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import a.b.c.common.FilePath;

public class Ex_URL_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			url : uniform Resource Locator : web address : ���Ͻĺ���, �����ڿ����ñ�
			uri : uniform Resource Identifier : ���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ���̶� �ڿ�
			
			uri > url :
			http://������:��Ʈ/���/�н�?key=value&page=12
			
			url : http://������:��Ʈ/���/�н� 
			uri : http://������:��Ʈ/���/�н�?key=value&page=12
		  
		*/
		// HTTP �������� URL �� ��û�� �� ����� �ִµ�
		// post ��� : http:// ������: ��Ʈ/���/���ϸ�.Ȯ����
//		get ��� : http://������:��Ʈ/���/���ϸ�.Ȯ����?key=value&key=value : url �� ����ǥ�� �ִ� �� : ?key=value&key=value
		// String urlStr = "https://nid.naver.com/nidlogin.login?mode=form&url=https%3A%2F%2Fwww.naver.com";
		// https://nid.naver.com/nidlogin.login
		String urlStr = "https" 		// ��������
				+ "://" 				// �������� �� ��� ������ 
				+ "nid.naver.com" 		// ip or ������
//				+ ":"  // ip or ������ �� ��Ʈ�� ������ 
//				+ "8080" // ��Ʈ
				+ "/nidlogin.login" 	// ������ ���
										// /nidlogin.login : ��û�� ���� ���� �� 
				+ "?"					// ������ ��� �� Query String ������ 
				+ "mode=form" 			// Query String : key=value
				+ "&" 					// ���� ��Ʈ�� ������
				+ "url=https%3A%2F%2Fwww.naver.com"; // Query String : key=value
		try {
			URL ur = new URL(urlStr); // �������� ur = new URL(urlStr);
			System.out.println("ur >>> : " + ur);
			System.out.println("ur.getProtocol()>>> : " + ur.getProtocol()); // �������� ȣ��
			System.out.println("ur.getHost() >>> : " + ur.getHost()); // ȣ��Ʈ ȣ��
			System.out.println("ur.getPort() >>> : " + ur.getPort()); // ��Ʈ ȣ��
			System.out.println("ur.getPath() >>> : " + ur.getPath()); // �н� ȣ��
			System.out.println("ur.getQuery() >>> : " + ur.getQuery()); // ���� ȣ��
			System.out.println("ur.getFile() >>> : " + ur.getFile()); // ���� ȣ��
			
			// sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@4566e5bd ���½�Ʈ��
			System.out.println("ur.operStream() >>> : " + ur.openStream()); 
			BufferedReader br = new BufferedReader(new InputStreamReader(ur.openStream(), "UTF-8")); // InputStreamReader()
			System.out.println("br >>> : " + br);
			String inLine = "";
			
			while((inLine = br.readLine()) != null) {
				System.out.println(inLine);
			}
			br.close();
		} catch(Exception e) {
			System.out.println("Error >>> : " + e.getMessage());
		}
	}

}
