import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int rand;
		rand = new Random ().nextInt(4);
	// 3. Print out this variable
		System.out.println(rand);
	// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("What question do you want to ask the almighty eight ball?");
	// 5. If the random number is 0
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "Sure I guess...");
		}
	// -- tell the user "Yes"
		else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "Not a chance budy boy");
		}
	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2
		else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You should ask google my broski.");
		}
	// -- tell the user "Maybe you should ask Google?"
		
	// 8. If the random number is 3
		else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "HAHAHHAHAHHAHA you wish stoopid.");
		}
	// -- write your own answer	
	}
}
