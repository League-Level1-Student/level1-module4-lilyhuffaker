import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements MouseListener{
	//JFrame frame;
	JButton joke;
	JButton punchline;
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
		
	}
	
	public void makeButtons() {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "Make Buttons");
		//make Frame
		JFrame frame;
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		//make Panel
		JPanel panel;
		panel = new JPanel();
		//Make joke button
		joke = new JButton();
		joke.setText("Joke");
		//Make punchline button
		punchline = new JButton();
		punchline.setText("Punchline");
		//Add it all together
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		
		joke.addMouseListener(this);
		punchline.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(joke)) {
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		}
		if(arg0.getSource().equals(punchline)) {
			JOptionPane.showMessageDialog(null, "Because he wanted to, you hater.");
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
