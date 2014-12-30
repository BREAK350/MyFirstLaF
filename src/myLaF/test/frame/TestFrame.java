package myLaF.test.frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public TestFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		initComponents();
		setVisible(true);
	}

	public void initComponents() {
		JPanel content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(content);
		JButton btn = new JButton("Button");
		content.add(btn);
	}

	public static void main(String[] args) {
		new TestFrame();
	}

}
