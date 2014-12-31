package myLaF.test.frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
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
		Font font = new Font("Arial", 0, 14);// "Helvetica Neue",
		// Helvetica, Arial,
		// sans-serif
		JPanel content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(content);

		JLabel label = new JLabel("label");
		label.setFont(font);
		content.add(label);

		JTextField textField = new JTextField("Text field");
		textField.setFont(font);
		content.add(textField);

		JButton button = new JButton("Button");
		button.setFont(font);
		content.add(button);

		JTable table = new JTable(new Object[][] { { "1", "Dima", "21" },
				{ "2", "Vasya", "16" }, { "3", "Alina", "16" },
				{ "4", "Dima", "18" } }, new Object[] { "id", "Name", "Age" });
		table.setFont(font);
		content.add(table);

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
