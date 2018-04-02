import javax.swing.*;
import java.awt.*;


public class GUITest extends JFrame{
	
	public GUITest(String str) {
		
	}

	public static void main(String[] args) {
		testOne();
	}
	
	public static void testOne() {
		JFrame one = new JFrame("Problem 12_1");
		one.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5)); 
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		one.add(p1);
		one.add(p2);
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		JButton button6 = new JButton("Button 6");
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p2.add(button4);
		p2.add(button5);
		p2.add(button6);
		one.setSize(560, 100);
		one.setDefaultCloseOperation(EXIT_ON_CLOSE);
		one.setVisible(true);

	}

}
