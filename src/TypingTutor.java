import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TypingTutor implements Runnable, KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new TypingTutor());
		
	}
	char currentLetter = generateRandomLetter();

	static char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	
}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setTitle("Type Or Die");
		frame.setSize(500,500);
		frame.setVisible(true);
		panel = new JPanel();
		panel.setSize(500,500);
		label = new JLabel();
		label.setText(Character.toString(currentLetter));
		panel.add(label);
		frame.add(panel);	
		frame.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar());
		if(arg0.getKeyChar() == currentLetter) {
			currentLetter = generateRandomLetter();
		}
	}
   }