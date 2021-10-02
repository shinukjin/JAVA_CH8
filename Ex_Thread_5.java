package a.b.c.ch8;

public class Ex_Thread_5 extends Thread{
	
	// 멤버변수
	int seqNum;
	
	public Ex_Thread_5(int seqNum) {
		
		this.seqNum = seqNum; //자기자신 클래스 멤버변수 초기화
	}
	public void run() {
		// 싱크로나이즈드 ; 동기화한다.
		synchronized(this){
		System.out.println(this.seqNum + " Thread Strat >>> : ");
		try {
			Thread.sleep(3000); // 3초뒤에 깬다.>>뒷부분 실행
			
			//.sleep()은  InterruptedException 예외처리해야한다.
		}catch(Exception e) {}
		
		System.out.println(this.seqNum + " Thread end >>> : ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() 시작 >>> : ");
		for (int i=0 ; i<20; i++) 
		{
			//Ex_Thread_5()생성자 만든다. ,생성자 역활은 초기화;
			Ex_Thread_5 tt3 = new Ex_Thread_5(i);
			
			//System.out.println("tt3 >>>> : " + tt3);
			tt3.start(); // start(); >> run() 연동되있음 이동
		}
		System.out.println("main() 끝>>> : ");
	}
}
