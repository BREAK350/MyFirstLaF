package myLaF.test.frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.gmail.break350.laf.MyLookAndFeel;

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

		JLabel label = new JLabel("label");
		content.add(label);
		JButton button = new JButton("Button");
		button.setFont(new Font(null, 0, 14));
		content.add(button);

		content.setBackground(Color.WHITE);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(MyLookAndFeel.class.getCanonicalName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		new TestFrame();
	}
}
