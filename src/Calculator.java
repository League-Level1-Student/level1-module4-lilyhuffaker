import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JPanel panel;
	JFrame frame;
	
	
	
	public void add(int arg1, int arg2) {
		JButton add = new JButton();
		panel.add(add);
		panel.add(divide);
		panel.add(multiply);
		panel.add(subtract);
	}
	
	public void subtract(int arg1, int arg2) {
		JButton subtract = new JButton();
	}
	
	public void multiply(int arg1, int arg2) {
		JButton multiply = new JButton();
	}
	
	public void divide(int arg1, int arg2) {
		JButton divide = new JButton();
	}

}