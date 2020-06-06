package _07_binary_converter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryConverter bC = new BinaryConverter();
		bC.drawBinaryConverter();
		
	}
	public void drawBinaryConverter() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField jtextfield = new JTextField(20);
		panel.add(jtextfield);
		frame.add(panel);
		JButton button = new JButton();
		panel.add(button);
		button.addMouseListener(this);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
