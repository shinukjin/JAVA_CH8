package a.b.c.ch8;

public class Ex_Thread_2 extends Thread{


	public static void a() {
		System.out.println(" 나는 a함수이다.");
		try {
		Thread.sleep(2000);; // 2초 동안 자다가 2초가 되면 자동으로 깨세요;
		}catch(InterruptedException i) {}
	}
	
	public void run() {
		System.out.println("run() >>> : start() 함수를 호출하면 run() 함수가 호출된다.");
		System.out.println("run() 함수 블럭에 내가 제어하고자 하는 일을 시킨다.");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException i) {}
		// 3초동안 자다가 3초 되면 자동으로 깨세요
		System.out.println("3초 자고 일어나세요.");
		Ex_Thread_2.a(); // a 함수 호출
		
		System.out.println("ThreadTest.a() 호출하고 나서>>>> : ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		new Ex_Thread_2().start(); //run 함수로 이동
	}
}
