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
			url : uniform Resource Locator : web address : 파일식별자, 유일자원지시기
			uri : uniform Resource Identifier : 인터넷에 있는 자원을 나타내는 유이란 자원
			
			uri > url :
			http://도메인:포트/경로/패스?key=value&page=12
			
			url : http://도메인:포트/경로/패스 
			uri : http://도메인:포트/경로/패스?key=value&page=12
		  
		*/
		// HTTP 프로토콜 URL 을 요청할 때 방법이 있는데
		// post 방식 : http:// 도메인: 포트/경로/파일명.확장자
//		get 방식 : http://도메인:포트/경로/파일명.확장자?key=value&key=value : url 에 꼬리표가 있는 것 : ?key=value&key=value
		// String urlStr = "https://nid.naver.com/nidlogin.login?mode=form&url=https%3A%2F%2Fwww.naver.com";
		// https://nid.naver.com/nidlogin.login
		String urlStr = "https" 		// 프로토콜
				+ "://" 				// 프로토콜 과 경로 구분자 
				+ "nid.naver.com" 		// ip or 도메인
//				+ ":"  // ip or 도메인 과 포트의 구분자 
//				+ "8080" // 포트
				+ "/nidlogin.login" 	// 웹서버 경로
										// /nidlogin.login : 요청한 실제 파일 명 
				+ "?"					// 웹서버 경로 와 Query String 구분자 
				+ "mode=form" 			// Query String : key=value
				+ "&" 					// 쿼리 스트링 구분자
				+ "url=https%3A%2F%2Fwww.naver.com"; // Query String : key=value
		try {
			URL ur = new URL(urlStr); // 참조변수 ur = new URL(urlStr);
			System.out.println("ur >>> : " + ur);
			System.out.println("ur.getProtocol()>>> : " + ur.getProtocol()); // 프로토콜 호출
			System.out.println("ur.getHost() >>> : " + ur.getHost()); // 호스트 호출
			System.out.println("ur.getPort() >>> : " + ur.getPort()); // 포트 호출
			System.out.println("ur.getPath() >>> : " + ur.getPath()); // 패스 호출
			System.out.println("ur.getQuery() >>> : " + ur.getQuery()); // 쿼리 호출
			System.out.println("ur.getFile() >>> : " + ur.getFile()); // 파일 호출
			
			// sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@4566e5bd 오픈스트림
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
