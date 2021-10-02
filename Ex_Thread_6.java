package a.b.c.ch8;

public class Ex_Thread_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new SyncTest();
		Thread t1= new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();

	}

}
