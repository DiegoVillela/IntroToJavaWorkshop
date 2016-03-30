package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String icu = JOptionPane.showInputDialog("Do you know how to write code? ");
		// 2. If they say "yes", tell them they will rule the world.
		if (icu.equals("Yes")) {
			System.out.println("You will rule the world!");
			JOptionPane.showMessageDialog(null, "You will rule the world!");
		} else {
			System.out.println("Goodluck Washing Dishes");
			JOptionPane.showMessageDialog(null, "Good Luck Washing Dishes");
		}
	}
}
// 3. Otherwise, wish them good luck washing dishes.
