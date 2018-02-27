package dynamic_beat_ver4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DynamicBeat extends JFrame {/*GUI기반의 프로그램을 만들기위해 기본적으로 상속받는 부분*/
	
	private Image screenImage;
	private Graphics screenGraphic; //더블버퍼링
	
	private Image introBackground= new ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	
	public DynamicBeat() {
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);		//사용자의 임의 크기설정 불가
		setLocationRelativeTo(null);  //화면 중앙에 나타남
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//게임창 종료시 프로그램 전체 종료
		setVisible(true); //default값이 false이므로 반드시 설정
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
