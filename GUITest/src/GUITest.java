import javax.swing.*;
import java.awt.*;


public class GUITest extends JFrame{
	
	public GUITest(String str) {
		this.setTitle(str);
		
		JPanel inputFields = new JPanel(); //create panel
		inputFields.setLayout(new GridLayout(0,2,20,20)); // set panel layout
		
		inputFields.add(new JLabel("First name:")); //add panel stuff
		inputFields.add(new JTextField());
		inputFields.add(new JLabel("Middle Initial:"));
		inputFields.add(new JTextField());
		inputFields.add(new JLabel("Last name:"));
		inputFields.add(new JTextField());
		
		add(inputFields, BorderLayout.NORTH); //add panel to frame
	}

	public static void main(String[] args) {
		GUITest frameWithComponents = new GUITest("Welcome to Facebook!");
		
		JButton okay = new JButton("facebook");
		Color red = new Color(50,0,0);
		Color facebookBlue = new Color(59,89,152);
		Font fbFont = new Font("Lucida Grande", Font.BOLD, 64);
		okay.setBackground(facebookBlue);
		okay.setForeground(Color.WHITE);
		okay.setFont(fbFont);
		frameWithComponents.add(okay, BorderLayout.CENTER);
		frameWithComponents.setSize(600, 300);
		frameWithComponents.setLocationRelativeTo(null);
		frameWithComponents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameWithComponents.setVisible(true);
	}

}
