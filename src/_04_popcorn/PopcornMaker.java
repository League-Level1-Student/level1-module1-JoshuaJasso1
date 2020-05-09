package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		Microwave kernel = new Microwave();
		String flavor  = JOptionPane.showInputDialog("What flavor of popcorn would you like?");
		Popcorn popcorn = new Popcorn(flavor);
		kernel.putInMicrowave(popcorn);
		String time = JOptionPane.showInputDialog("How many minutes do you want to cook your popcorn for?");
		int minutes = Integer.parseInt(time);
		kernel.setTime(minutes);
		kernel.startMicrowave();
		
	}

}
