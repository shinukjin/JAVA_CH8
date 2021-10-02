package a.b.c.ch8;

public class Ex_Thread extends Thread{
	
	@Override
	public void run() {
		System.out.println("run() 함수");
		System.out.println("Thread 클래스에 있는 start()를 시작하면");
		System.out.println("바로 run()함수를 호출한다.  ");
		System.out.println("Thread 클래스에 있는 start() 함수와 run() 함수는 링크가 걸려있다.\n");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// start() - run()연동되어있어서 따로 run()하지 않고 start()를 불러도 run()로 넘어간다.
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
