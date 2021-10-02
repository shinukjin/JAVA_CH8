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

// ������ Ŭ���� ���
public class Ex_TcpIPBasicServer extends Thread{
	
	private ServerSocket ss; // ����ȭ
	
	public Ex_TcpIPBasicServer() throws  IOException{
		System.out.println(">>> : �������� . ");
		//��������(��Ʈ, ����Ʈ, �������ּ�(String �ּҷ�));
		ss = new ServerSocket(7070,200,InetAddress.getByName("192.168.219.108"));
	}
	public void run(){
		while (true)
		{
			try
			{
				System.out.println(">>> : Ŭ���̾�Ʈ ���� ���." + ss);			
				Socket sc = ss.accept(); //�������Ͽ� Ŭ���̾�Ʈ ������ ������������ ���, �����͵�����  ���� sc�� ���ʱ�ȭ��Ŵ
				System.out.println(">>> : Ŭ���̾�Ʈ ���� ���� ����." + sc);

				BufferedReader in = 
				new BufferedReader(new InputStreamReader(sc.getInputStream())); //���� �����͸� �����غ�
				PrintWriter out = 
				new PrintWriter(new OutputStreamWriter(sc.getOutputStream())); // ���� �����͸� �� �غ�

				// Ŭ���̾�Ʈ �������κ��� ���� �޽����� ȭ�鿡 ���
				System.out.println("[Ŭ���̾�Ʈ]" + in.readLine()); // ���� �����͸� ȭ�鿡 ���ڿ��� ����.
				// Ŭ���̾�Ʈ ���Ͽ� �޽��� ����
				String msg = "������ �����Ͻ� ���� ȯ���մϴ�.!!";
				out.println(msg);
				out.flush(); // 
				System.out.println("[����]" + msg);
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
			
			t.start(); // ������.start()�Լ��� run()�Լ��� ��ũ�Ǿ����� >> ��ũ �Լ� ����
		}
		catch(IOException e) {
			System.out.println("e >>> : " + e.getMessage());
		}
	}
}
		
		


		