package dynamic_beat_ver4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DynamicBeat extends JFrame {/*GUI����� ���α׷��� ��������� �⺻������ ��ӹ޴� �κ�*/
	
	private Image screenImage;
	private Graphics screenGraphic; //������۸�
	
	private Image introBackground= new ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	
	public DynamicBeat() {
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);		//������� ���� ũ�⼳�� �Ұ�
		setLocationRelativeTo(null);  //ȭ�� �߾ӿ� ��Ÿ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����â ����� ���α׷� ��ü ����
		setVisible(true); //default���� false�̹Ƿ� �ݵ�� ����
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		menuBar.setBounds(0, 0, 1280, 30);
		add(menuBar);
		
		Music introMusic = new Music("introMusic.mp3",true);
		introMusic.start();
	} 
	
	public void paint(Graphics g) {
			screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			screenGraphic = screenImage.getGraphics();
			screenDraw(screenGraphic);
			g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
	
	
}
