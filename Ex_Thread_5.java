package a.b.c.ch8;

public class Ex_Thread_5 extends Thread{
	
	// �������
	int seqNum;
	
	public Ex_Thread_5(int seqNum) {
		
		this.seqNum = seqNum; //�ڱ��ڽ� Ŭ���� ������� �ʱ�ȭ
	}
	public void run() {
		// ��ũ�γ������ ; ����ȭ�Ѵ�.
		synchronized(this){
		System.out.println(this.seqNum + " Thread Strat >>> : ");
		try {
			Thread.sleep(3000); // 3�ʵڿ� ����.>>�޺κ� ����
			
			//.sleep()��  InterruptedException ����ó���ؾ��Ѵ�.
		}catch(Exception e) {}
		
		System.out.println(this.seqNum + " Thread end >>> : ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() ���� >>> : ");
		for (int i=0 ; i<20; i++) 
		{
			//Ex_Thread_5()������ �����. ,������ ��Ȱ�� �ʱ�ȭ;
			Ex_Thread_5 tt3 = new Ex_Thread_5(i);
			
			//System.out.println("tt3 >>>> : " + tt3);
			tt3.start(); // start(); >> run() ���������� �̵�
		}
		System.out.println("main() ��>>> : ");
	}
}
