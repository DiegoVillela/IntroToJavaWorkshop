package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello");
		String live = JOptionPane.showInputDialog("Where do you live?");
		JOptionPane.showMessageDialog(null, "Ha! Now I can stalk you!");
		String abc = JOptionPane.showInputDialog("What is your favorite song?");
		JOptionPane.showMessageDialog(null, "Aw man! I thought it was going to be by Justin Beiber!");
		String abcd = JOptionPane.showInputDialog("What is your credit card number? I swear I won't tell anyone!");
		JOptionPane.showMessageDialog(null, "Just Kidding! Now I'm going to tell everyone! #stolepersonscreditcardnumber");
	}

}
