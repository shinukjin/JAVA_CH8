package a.b.c.ch8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Thread_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		System.out.println("main �Լ� ����");
		Runnable r =new SyncTest_1();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start(); // SyncTest_1 Ŭ������ run()�� ��ũ�Ǿ�����
		t2.start(); // SyncTest_1 Ŭ������ run()�� ��ũ�Ǿ�����
		
		System.out.println("main �Լ� ����");
	}
}
