package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

// 쓰레드 클래스 상속
public class Ex_TcpIPBasicServer extends Thread{
	
	private ServerSocket ss; // 은닉화
	
	public Ex_TcpIPBasicServer() throws  IOException{
		System.out.println(">>> : 서버시작 . ");
		//서버소켓(포트, 백포트, 아이피주소(String 주소로));
		ss = new ServerSocket(7070,200,InetAddress.getByName("192.168.219.108"));
	}
	public void run(){
		while (true)
		{
			try
			{
				System.out.println(">>> : 클라이언트 접속 대기." + ss);			
				Socket sc = ss.accept(); //서버소켓에 클라이언트 데이터 들어오기전까지 대기, 데이터들어오면  소켓 sc에 ㅊ초기화시킴
				System.out.println(">>> : 클라이언트 욱진 접속 성공." + sc);

				BufferedReader in = 
				new BufferedReader(new InputStreamReader(sc.getInputStream())); //들어온 데이터를 읽을준비
				PrintWriter out = 
				new PrintWriter(new OutputStreamWriter(sc.getOutputStream())); // 들어온 데이터를 쓸 준비

				// 클라이언트 소켓으로부터 받은 메시지를 화면에 출력
				System.out.println("[클라이언트]" + in.readLine()); // 들어온 데이터를 화면에 문자열로 쓴다.
				// 클라이언트 소켓에 메시지 전송
				String msg = "서버에 접속하신 것을 환영합니다.!!";
				out.println(msg);
				out.flush(); // 
				System.out.println("[서버]" + msg);
			}			
			catch (Exception e)
			{
				System.out.println("e >>> : " + e.getMessage());
				break;
			}
		}
	}
	public static void main(String args[]){
		
		try {
			Ex_TcpIPBasicServer tbs = new Ex_TcpIPBasicServer();
			
			Thread t = new Thread(tbs);
			
			t.start(); // 쓰레드.start()함수는 run()함수와 링크되어있음 >> 링크 함수 ㄱㄱ
		}
		catch(IOException e) {
			System.out.println("e >>> : " + e.getMessage());
		}
	}
}
		
		


		