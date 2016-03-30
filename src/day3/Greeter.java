package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String greetings = JOptionPane.showInputDialog("Hello how are you?");
		JOptionPane.showMessageDialog(null, "Interesting");
		String name = JOptionPane.showInputDialog("What's your name?");
		String howold = JOptionPane.showInputDialog("How old are you?");
	}
}
