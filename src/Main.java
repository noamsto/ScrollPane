import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {


		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setPreferredSize(new Dimension(800, 600));		
		
		JLabel myPic = new JLabel();
		ImageIcon img = new ImageIcon("cat.jpg");
		myPic.setIcon(img);
		myPic.setSize(new Dimension(img.getIconWidth(), img.getIconHeight()));

		MyScrollerPane msp= new MyScrollerPane(myPic);
		
		
		app.add(msp);
		app.pack();
		app.setVisible(true);
		
			
		
		
	}

}
