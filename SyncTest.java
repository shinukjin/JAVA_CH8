package a.b.c.ch8;

public class SyncTest implements Runnable{
	
	BankAccount ac= new BankAccount();
	public void run() {
		while(ac.balance > 0) {
			
			//100,200,300 ���� �� ���� ���Ƿ� �����ؼ� ���
			int money =(int)(Math.random() * 3+1)*100;
			ac.withdraw(money);
			System.out.println("balace >>> : " + ac.balance);
		}
	}
	

}
