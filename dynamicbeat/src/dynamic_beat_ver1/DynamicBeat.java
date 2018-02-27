package dynamic_beat_ver1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {/*GUI기반의 프로그램을 만들기위해 기본적으로 상속받는 부분*/
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);		//사용자의 임의 크기설정 불가
		setLocationRelativeTo(null);  //화면 중앙에 나타남
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//게임창 종료시 프로그램 전체 종료
		setVisible(true); //default값이 false이므로 반드시 설정
		
	}
}
