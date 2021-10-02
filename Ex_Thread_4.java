package a.b.c.ch8;

public class Ex_Thread_4 extends Thread{
	
	// 멤버변수
	int seqNum;
	
	public Ex_Thread_4(int seqNum) {
		this.seqNum = seqNum; // 멤버변수 초기화
	}
	
	public void run() {
		System.out.println(this.seqNum + " Thread Strat >>> : ");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		
		System.out.println(this.seqNum + " Thread end >>> : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0 ; i<20; i++) {
			
			Ex_Thread_4 tt2 = new Ex_Thread_4(i);
			
			//System.out.println();
			
			tt2.start();
		}
		System.out.println("main() 끝>>> : ");
	}

}
