package a.b.c.ch8;

public class BankAccount {
	int balance = 1000;
	public void withdraw(int money) {
		if (balance >money) {
			try {
				Thread.sleep(1000);}catch(Exception e) {}
			balance -= money;
		}
	} // with draw
	
}
