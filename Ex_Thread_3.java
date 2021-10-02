package a.b.c.ch8;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;


//Digital TimeZone
// DigiTimeZone.java
@SuppressWarnings("serial")
public class Ex_Thread_3 extends JFrame implements Runnable {
	
	private static final long serialVersionUID = 1L;
	
	// ���
	public static final int TIME_ZONE_0 = 0;
	public static final int TIME_ZONE_1 = 1;
	public static final int TIME_ZONE_2 = 2;
	public static final int TIME_ZONE_3 = 3;
	
	public static final int TIME_CITY_0 = 0;
	public static final int TIME_CITY_1 = 1;
	public static final int TIME_CITY_2 = 2;
	public static final int TIME_CITY_3 = 3;
	
	// ��� �迭
	public static final String timeZone[] = {	"Asia/Seoul"
												,"America/New_York"
												,"Europe/Paris"
												,"Europe/London"};
		
	public static final String timeCity[] = {	"����"
												,"����"
												,"�ĸ�"
												,"����" };
	
	//������� : ����ȭ : eucapsulation
	
	private Thread thread;
	private JLabel label;
	private String timeZoneID;
	
	public Ex_Thread_3(String timeZondID, String timeCity) {
		
		super(timeCity + "::: ����ð�");
		this.timeZoneID = timeZondID;
		
		setLayout(new FlowLayout()); // �߾�����
		label = new JLabel();
		label.setFont(new Font("Serif", Font.PLAIN, 20));
		
		if(thread == null) {
			thread = new Thread(this);
			thread.start();
		}
		
		add(label);
		setBounds(100,100,400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		// Asia/ SEoul, America/NewYork, Europe/Paris, Europe/London
		// String timeZondID = "Europe/Paris";
		
		TimeZone tz = TimeZone.getTimeZone(this.timeZoneID);
		while(true) {
			Calendar cal = Calendar.getInstance(tz);
			
			String now = cal.get(Calendar.YEAR) + "��" + 
						 (cal.get(Calendar.MONTH)+1) + "��" +
						 cal.get(Calendar.DATE) + "��" + 
						 cal.get(Calendar.HOUR) + "��" + 
						 cal.get(Calendar.MINUTE) + "��" + 
						 cal.get(Calendar.SECOND) + "��";
						//cla.get(Calendar.MILLISECOND) + "�и�������";*/
			
			label.setText(":::" + now);
			
			try {
				Thread.sleep(1000);; //1��
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ð��� ���� �Ͻÿ� \n"
							+ "00 : ���� \n"
							+ "01 : ���� \n"
							+ "02 : �ĸ� \n"
							+ "03 : ���� \n");
		
		String zoneID = sc.next();
		
		if("00".equals(zoneID)) {
			System.out.println("���� �ð��� ���� �߽��ϴ�.");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_0], 
												Ex_Thread_3.timeCity[0]);
		}
		
		if("01".equals(zoneID)) {
			System.out.println("���� �ð��� ���� �߽��ϴ�.");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_1], 
												Ex_Thread_3.timeCity[1]);
		}

		
		if("02".equals(zoneID)) {
			System.out.println("�ĸ� �ð��� ���� �߽��ϴ�.");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_2], 
												Ex_Thread_3.timeCity[2]);
		}

		
		if("03".equals(zoneID)) {
			System.out.println("���� �ð��� ���� �߽��ϴ�.");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_3], 
												Ex_Thread_3.timeCity[3]);
		}
		sc.close();
	}
}
