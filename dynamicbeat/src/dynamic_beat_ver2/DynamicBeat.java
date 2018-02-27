package dynamic_beat_ver2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {/*GUI����� ���α׷��� ��������� �⺻������ ��ӹ޴� �κ�*/
	
	private Image screenImage;
	private Graphics screenGraphic; //������۸�
	
	private Image introBackground;
	
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);		//������� ���� ũ�⼳�� �Ұ�
		setLocationRelativeTo(null);  //ȭ�� �߾ӿ� ��Ÿ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����â ����� ���α׷� ��ü ����
		setVisible(true); //default���� false�̹Ƿ� �ݵ�� ����
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg")).getImage();
		
	} 
	
	public void paint(Graphics g) {
			screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			screenGraphic = screenImage.getGraphics();
			screenDraw(screenGraphic);
			g.drawImage(screenImage, 0, 0, null);
			
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
	
	
}
