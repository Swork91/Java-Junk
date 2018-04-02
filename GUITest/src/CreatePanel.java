import javax.swing.*;
import java.awt.*;

public class CreatePanel extends JPanel{
private static int buttCount = 1;
	public CreatePanel() {
		for (int i=0; i<3; i++) {
			add(new JButton("Button "+buttCount));
			buttCount++;
		}
	}
}
