package _07_binary_converter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	JTextField jtextfield;
	JLabel label;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryConverter bC = new BinaryConverter();
		bC.drawBinaryConverter();

	}

	public void drawBinaryConverter() {
		JFrame frame = new JFrame("Convert 8 Bits of Binary to ASCII");
		JPanel panel = new JPanel();
		jtextfield = new JTextField(20);
		panel.add(jtextfield);
		frame.add(panel);
		JButton button = new JButton("Convert");
		label = new JLabel(" ");
		panel.add(button);
		panel.add(label);
		button.addMouseListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";// must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String input = jtextfield.getText();

		String ascii = convert(input);
		label.setText(ascii);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
