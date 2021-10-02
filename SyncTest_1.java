package a.b.c.ch8;

import a.b.c.common.*;
//Runnable Ŭ������ ����Ұ�� run�Լ��� ����ü�� ���������Ѵ�.
public class SyncTest_1 implements Runnable{
	BankAccount_1 ac1= new BankAccount_1(); //������ new BankAccount_1(), �������� ac1 ����
	
	public void run() {
		System.out.println("run()�Լ� ����");
		
		synchronized(this) {
			System.out.println("synchronized(this)�� ���� >>> : ");
			 // BankAccount_1�� balance�� 0���� Ŭ��
			while(ac1.balance >0) {
				System.out.println("while(ac1.balance >0) ������");
				
				// 100, 200, 300���� �� ���� ������ �����ؼ� ���(withdraw)
				int money = (int)(Math.random() *3 +1) *100; //random()�Լ��� ������Ÿ���� double�� �����Ƿ� ���������ȯ�� ���ش�(double >> int)
				ac1.withdraw(money); //��������.�Լ�() >> BankAccount_1 �� withdraw(money) �Լ� ���� / money : �ƱԸ�Ʈ
				
				System.out.println("balance >>> : " + ac1.balance
									+ " : ��ݽð� >>> : " 
									+ DateUtil.cTime()); // a,b,c,commond.DateUtil.cTime() �Լ��� ������
				
			}
		}
	}
}
