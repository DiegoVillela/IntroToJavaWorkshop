
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic_Eight_Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new
		// Random().nextInt(4)"
		int randomnumber = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(randomnumber);
		// 4. Get the user to enter a question for the 8 ball
		String hi = JOptionPane.showInputDialog("Ask the Magic 8 Ball a question.");
		// 5. If the random number is 0

		// -- tell the user "Yes"
		if (randomnumber == 0) {
			JOptionPane.showMessageDialog(null, "Yes!");
		}

		// 6. If the random number is 1
		if (randomnumber == 1) {
			JOptionPane.showMessageDialog(null, "No!");
		}

		// -- tell the user "No"

		// 7. If the random number is 2
		if (randomnumber == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Morgan Freeman");

		}

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (randomnumber == 3) {
			JOptionPane.showMessageDialog(null, "Hey I'm fake, go kiss Justin Beiber.");
		}
	}
	// -- write your own answer

}
