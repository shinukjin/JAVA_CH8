package a.b.c.ch8;

import a.b.c.common.*;
//Runnable 클래스를 상속할경우 run함수의 구현체를 만들어줘야한다.
public class SyncTest_1 implements Runnable{
	BankAccount_1 ac1= new BankAccount_1(); //생성자 new BankAccount_1(), 참조변수 ac1 만듬
	
	public void run() {
		System.out.println("run()함수 시작");
		
		synchronized(this) {
			System.out.println("synchronized(this)블럭 시작 >>> : ");
			 // BankAccount_1의 balance가 0보다 클때
			while(ac1.balance >0) {
				System.out.println("while(ac1.balance >0) 블럭시작");
				
				// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
				int money = (int)(Math.random() *3 +1) *100; //random()함수는 데이터타입이 double로 나오므로 명시적형변환을 해준다(double >> int)
				ac1.withdraw(money); //참조변수.함수() >> BankAccount_1 의 withdraw(money) 함수 실행 / money : 아규먼트
				
				System.out.println("balance >>> : " + ac1.balance
									+ " : 출금시간 >>> : " 
									+ DateUtil.cTime()); // a,b,c,commond.DateUtil.cTime() 함수를 가져옴
				
			}
		}
	}
}
