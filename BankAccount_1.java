package a.b.c.ch8;

public class BankAccount_1 {
	
	int balance = 1000;
	// int balance = 1000000;
	
		/*
			synchronized Ű���� :  ����ȭ�� ��ü�� ���� ����ȭ�� �̷�� ��
			                                         ���� ��ü�� ���� ��� ����ȭ ���� �� ������ 
								 ���� �� �����常�� �� ������ ����(����) �ϵ��� �Ѵ�. 
								 ���� ������ �õ��ϴ� �ٸ� ��������� 
								 �� ���� �����尡 ������ ��ġ�� ���� ��� ������
								 ���(blocked) ���°� �ȴ�. 

			�����
			1. synchronized void �Լ�()
			2. static synchronized void �Լ�() 
			3. synchronized(this){}
			4. static synchronized(this){}
		*/
	
	public synchronized void withdraw(int money) {
		System.out.println("synchronized void withdraw(int money) ����");
		if(balance >= money) {
			try {Thread.sleep(1000);}catch(Exception e) {}
			balance -= money;
		}
	}
}
