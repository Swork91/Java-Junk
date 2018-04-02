import javax.swing.*;
import java.awt.*;


public class GUITest extends JFrame{
	
	public GUITest(String str) {
		
	}

	public static void main(String[] args) {
		testOne();
		testTwo();
		testThree();
		testFour();
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
		
		one.setLocationRelativeTo(null);
		one.setSize(560, 100);
		one.setDefaultCloseOperation(EXIT_ON_CLOSE);
		one.setVisible(true);

	}
	
	public static void testTwo() {//south and center
		JFrame two = new JFrame("Problem 12_2");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		two.add(p1, BorderLayout.CENTER);
		two.add(p2, BorderLayout.SOUTH);

		p1.add(new JButton("Button 1"));
		p1.add(new JButton("Button 2"));
		p1.add(new JButton("Button 3"));
		p2.add(new JButton("Button 4"));
		p2.add(new JButton("Button 5"));
		p2.add(new JButton("Button 6"));
		
		
		two.setLocation(1920, 1080-400);
		two.setSize(300, 150);
		two.setDefaultCloseOperation(EXIT_ON_CLOSE);
		two.setVisible(true);
	}
	
	public static void testThree() {//two row ,three columns
		JFrame three = new JFrame("Problem 12_3");
		three.setLayout(new GridLayout(2,3,5,5));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		three.add(p1);
		three.add(p2);

		p1.add(new JButton("Button 1"));
		p1.add(new JButton("Button 2"));
		p1.add(new JButton("Button 3"));
		p2.add(new JButton("Button 4"));
		p2.add(new JButton("Button 5"));
		p2.add(new JButton("Button 6"));
		
		three.setLocation(1920, 1080+400);
		three.setSize(300, 150);
		three.setDefaultCloseOperation(EXIT_ON_CLOSE);
		three.setVisible(true);
	}
	
	public static void testFour() { //using custom create panel class to make buttons
		JFrame four = new JFrame("Problem 12_4");
		four.setLayout(new GridLayout(2,3,5,5));
		JPanel p1 = new CreatePanel();
		JPanel p2 = new CreatePanel();
		four.add(p1);
		four.add(p2);

		four.setLocation(1920+400, 1080+400);
		four.setSize(300, 150);
		four.setDefaultCloseOperation(EXIT_ON_CLOSE);
		four.setVisible(true);
	}

}
