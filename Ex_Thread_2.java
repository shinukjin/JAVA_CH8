package a.b.c.ch8;

public class Ex_Thread_2 extends Thread{


	public static void a() {
		System.out.println(" ���� a�Լ��̴�.");
		try {
		Thread.sleep(2000);; // 2�� ���� �ڴٰ� 2�ʰ� �Ǹ� �ڵ����� ������;
		}catch(InterruptedException i) {}
	}
	
	public void run() {
		System.out.println("run() >>> : start() �Լ��� ȣ���ϸ� run() �Լ��� ȣ��ȴ�.");
		System.out.println("run() �Լ� ���� ���� �����ϰ��� �ϴ� ���� ��Ų��.");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException i) {}
		// 3�ʵ��� �ڴٰ� 3�� �Ǹ� �ڵ����� ������
		System.out.println("3�� �ڰ� �Ͼ����.");
		Ex_Thread_2.a(); // a �Լ� ȣ��
		
		System.out.println("ThreadTest.a() ȣ���ϰ� ����>>>> : ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		new Ex_Thread_2().start(); //run �Լ��� �̵�
	}
}
