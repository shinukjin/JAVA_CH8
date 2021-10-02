package a.b.c.ch8;

public class SyncTest implements Runnable{
	
	BankAccount ac= new BankAccount();
	public void run() {
		while(ac.balance > 0) {
			
			//100,200,300 중의 한 값을 임의로 선택해서 출금
			int money =(int)(Math.random() * 3+1)*100;
			ac.withdraw(money);
			System.out.println("balace >>> : " + ac.balance);
		}
	}
	

}
