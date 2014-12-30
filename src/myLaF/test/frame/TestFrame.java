package myLaF.test.frame;

import javax.swing.JFrame;

public class TestFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public TestFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestFrame();
	}

}
