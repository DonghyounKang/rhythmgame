package dynamic_beat_ver1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {/*GUI����� ���α׷��� ��������� �⺻������ ��ӹ޴� �κ�*/
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);		//������� ���� ũ�⼳�� �Ұ�
		setLocationRelativeTo(null);  //ȭ�� �߾ӿ� ��Ÿ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����â ����� ���α׷� ��ü ����
		setVisible(true); //default���� false�̹Ƿ� �ݵ�� ����
		
	}
}
