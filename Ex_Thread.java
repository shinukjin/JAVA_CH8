package a.b.c.ch8;

public class Ex_Thread extends Thread{
	
	@Override
	public void run() {
		System.out.println("run() �Լ�");
		System.out.println("Thread Ŭ������ �ִ� start()�� �����ϸ�");
		System.out.println("�ٷ� run()�Լ��� ȣ���Ѵ�.  ");
		System.out.println("Thread Ŭ������ �ִ� start() �Լ��� run() �Լ��� ��ũ�� �ɷ��ִ�.\n");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// start() - run()�����Ǿ��־ ���� run()���� �ʰ� start()�� �ҷ��� run()�� �Ѿ��.
		new Ex_Thread().start();
		
		Ex_Thread ex = new Ex_Thread();
		Thread t = new Thread(ex);
		System.out.println("\nt >>> : " + t);
		System.out.println("t.getId() >>> : " + t.getId());
		System.out.println("t.getName() >>> : " + t.getName());
		System.out.println("t.getPriority() >>> : " + t.getPriority());
		t.start();
	}

}
